package com.example.emailapp

// This class lets you easily fetch emails.
//   EmailFetcher.getEmails()      -> the initial list of 10 emails
//   EmailFetcher.getNext5Emails() -> the next 5 emails (for the Load More stretch feature)
class EmailFetcher {
    companion object {
        val senders = listOf(
            "Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon",
            "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley",
            "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer",
            "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould"
        )

        // Stretch: a sent date for each email
        val dates = listOf(
            "Sep 6", "Sep 6", "Sep 5", "Sep 5", "Sep 4",
            "Sep 3", "Sep 3", "Sep 2", "Sep 1", "Aug 30",
            "Aug 29", "Aug 28", "Aug 27", "Aug 26", "Aug 25"
        )

        // Stretch: read/unread status. Unread emails will be bolded in the list.
        val readStatus = listOf(
            false, true, false, true, true,
            false, true, true, false, true,
            false, true, false, true, true
        )

        val title = "Welcome to Kotlin!"
        val summary = "Welcome to the Android Kotlin Course! We're excited to have you " +
            "join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."

        fun getEmails(): MutableList<Email> {
            val emails: MutableList<Email> = ArrayList()
            for (i in 0..9) {
                val email = Email(senders[i], title, summary, dates[i], readStatus[i])
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            val newEmails: MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(senders[i], title, summary, dates[i], readStatus[i])
                newEmails.add(email)
            }
            return newEmails
        }
    }
}
