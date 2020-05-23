def call(def event, def code) {
    println "hello from durationEvent: $event"
    code()
    println "hello from durationEvent: $event"
}