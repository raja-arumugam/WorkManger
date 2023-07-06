package com.example.workmanager

import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class NotificationWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {

        val notification = NotificationCompat.Builder(applicationContext, "default")
            .setSmallIcon(R.mipmap.ic_launcher_round)
            .setContentText("Background Work Manager has been done.!")
            .setContentTitle("Work Manager Background")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

        NotificationManagerCompat.from(applicationContext).notify(1, notification)

        return Result.success()
    }
}