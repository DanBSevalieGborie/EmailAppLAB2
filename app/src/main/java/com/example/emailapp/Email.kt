package com.example.emailapp

// This class (also called a "model") defines the information contained in each Email.
// The 'date' and 'isRead' fields power the stretch features (sent date + bold unread).
class Email(
    val sender: String,
    val title: String,
    val summary: String,
    val date: String,
    val isRead: Boolean
)
