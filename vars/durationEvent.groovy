import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

def call(def event, Closure closure) {
    def timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
    echo "${timestamp}|duration|start|$event"
    closure()
    echo "${timestamp}|duration|end|$event"
}