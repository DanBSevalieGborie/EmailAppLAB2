package com.example.emailapp

import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// The adapter takes in the list of emails and bridges the data to email_item.xml.
class EmailAdapter(private val emails: List<Email>) :
    RecyclerView.Adapter<EmailAdapter.ViewHolder>() {

    // Provide a direct reference to each of the views within a data item.
    // Used to cache the views within the item layout for fast access.
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val avatarImageView: ImageView = itemView.findViewById(R.id.avatarIv)
        val senderTextView: TextView = itemView.findViewById(R.id.senderTv)
        val dateTextView: TextView = itemView.findViewById(R.id.dateTv)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTv)
        val summaryTextView: TextView = itemView.findViewById(R.id.summaryTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Populate data into the item through the holder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val email = emails[position]

        // Set item views based on views and data model
        holder.senderTextView.text = email.sender
        holder.titleTextView.text = email.title
        holder.summaryTextView.text = email.summary
        holder.dateTextView.text = email.date

        // Stretch feature (Step 8): bold the sender & title if the email is unread.
        // We set NORMAL in the else branch because ViewHolders are recycled and could
        // otherwise keep a bold style from a previous row.
        if (!email.isRead) {
            holder.senderTextView.setTypeface(null, Typeface.BOLD)
            holder.titleTextView.setTypeface(null, Typeface.BOLD)
        } else {
            holder.senderTextView.setTypeface(null, Typeface.NORMAL)
            holder.titleTextView.setTypeface(null, Typeface.NORMAL)
        }
    }

    override fun getItemCount(): Int {
        return emails.size
    }
}
