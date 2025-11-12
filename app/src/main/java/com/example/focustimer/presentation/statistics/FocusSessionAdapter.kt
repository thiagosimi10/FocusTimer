package com.example.focustimer.presentation.statistics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.focustimer.R
import com.example.focustimer.domain.model.FocusSession
import java.text.SimpleDateFormat
import java.util.*

/**
 * Adapter for displaying a list of focus sessions in a RecyclerView.
 */
class FocusSessionAdapter : RecyclerView.Adapter<FocusSessionAdapter.SessionViewHolder>() {

    private val sessions: MutableList<FocusSession> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_session, parent, false)
        return SessionViewHolder(view)
    }

    override fun getItemCount(): Int = sessions.size

    override fun onBindViewHolder(holder: SessionViewHolder, position: Int) {
        val session = sessions[position]
        holder.bind(session)
    }

    /**
     * Replace the current list of sessions with a new one.
     */
    fun submitList(newSessions: List<FocusSession>) {
        sessions.clear()
        sessions.addAll(newSessions)
        notifyDataSetChanged()
    }

    class SessionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val dateFormat = SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault())
        private val timeTextView: TextView = itemView.findViewById(R.id.textViewTime)
        private val durationTextView: TextView = itemView.findViewById(R.id.textViewDuration)

        fun bind(session: FocusSession) {
            val startTime = Date(session.startTime)
            val endTime = session.endTime?.let { Date(it) }
            val timeString = if (endTime != null) {
                // Show start and end times
                val startStr = dateFormat.format(startTime)
                val endStr = dateFormat.format(endTime)
                "$startStr - $endStr"
            } else {
                // Show only start time if session not finished
                dateFormat.format(startTime)
            }
            val durationString = session.durationMinutes?.let { "$it min" } ?: "--"
            timeTextView.text = timeString
            durationTextView.text = durationString
        }
    }
}