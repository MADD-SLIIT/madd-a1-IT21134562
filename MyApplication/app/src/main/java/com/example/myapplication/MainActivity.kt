import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            // When a date is selected, log the period start date, etc.
            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            Toast.makeText(this, "Selected date: $selectedDate", Toast.LENGTH_SHORT).show()

            // Store or update the selected date in a database
        }
    }
}
