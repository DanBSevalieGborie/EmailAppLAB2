package com.example.emailapp

// NOTE: Keep the `package com.example.yourapp` line that Android Studio
// generates at the very top of this file when you create it.

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.emailapp.EmailAdapter

class MainActivity : AppCompatActivity() {

    // MutableList so we can add the next 5 emails for the Load More stretch feature.
    lateinit var emails: MutableList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Look up the RecyclerView in the activity layout
        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)

        // Fetch the list of emails
        emails = EmailFetcher.getEmails()

        // Create the adapter, passing in the list of emails
        val adapter = EmailAdapter(emails)

        // Attach the adapter to the RecyclerView to populate items
        emailsRv.adapter = adapter

        // Set the layout manager to position the items on top of each other
        emailsRv.layoutManager = LinearLayoutManager(this)

        // Stretch feature (Step 7): Load More button
        findViewById<Button>(R.id.loadMoreBtn).setOnClickListener {
            // Fetch the next 5 emails
            val newEmails = EmailFetcher.getNext5Emails()
            // Add the new emails to our existing list
            emails.addAll(newEmails)
            // Notify the adapter so the RecyclerView refreshes with the new emails
            adapter.notifyDataSetChanged()
        }
    }
}
