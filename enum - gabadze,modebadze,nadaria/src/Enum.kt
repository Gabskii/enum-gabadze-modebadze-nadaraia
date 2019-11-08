fun main() {
    for (day in DAYS.values()) { // For ციკლით ჩამოვუარეთ ყველა კვირის დღეს
        if (DAYS.shabatkvira(day) == true) {
            // თუ მეთოდმა (shabatkvira) დააბრუნა true ანუ თუ კონკრეტული დღე არის შაბათ-კვირა, დაბეჭდოს ის
            println("დღეს არის ${day} და დასვენების დღეა")
        } else if (DAYS.shabatkvira(day) == false) {
            // თუ კონკრეტული დღე შაბათ-კვირა არ არის ანუ აბრუნებს false, დაბეჭდოს ის
            println("დღეს არის ${day} დასვენების დღე არ არის")
        }
    }
}

enum class DAYS(val isWeekend: Boolean = false) {
    // ვქმნით enum კლასს, პარამეტრით isWeekend რომელიც თავდაპირველად ყველა enum-ში false-ია
    კვირა(true),
    //   შაბათ-კვირის დღეებზე override გავაკეთეთ და isWeekend-ს მივანიჭეთ true
    ორშააბათი,
    ოთხშაბათი,
    ხუთშაბათი,
    პარასკევი,
    შაბათი(true);

    companion object {
        fun shabatkvira(obj: DAYS): Boolean {
            //  ეს მეთოდი ამოწმებს არის თუ არა კონკრეტული დღე შაბათ-კვირა
            return obj.name.compareTo("შაბათი") == 0 || obj.name.compareTo("კვირა") == 0

        }
    }
}

