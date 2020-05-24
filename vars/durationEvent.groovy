import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

def call(def event, Closure closure) {
    def startTs = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
    echo "${startTs}|duration|start|$event"
    closure()
    def endTs = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
    echo "${endTs}|duration|end|$event"
}