package com.ero.mysmartband

object SmartbandData {
    private val sbName = arrayOf(
        "Amazfit Cor 2",
        "Fitbit Charge 4",
        "Garmin Vivosmart 4",
        "Garmin Vivofit 4",
        "Honor Band 5",
        "Huawei Band 4",
        "Mi Band 4",
        "Realme Band",
        "Samsung Fit e",
        "Samsung Gear Fit2 Pro"
    )

    private val sbharga = arrayOf(
        "Rp 385.000",
        "Rp 2.899.000",
        "Rp 2.399.000",
        "Rp 999.000",
        "Rp 348.000",
        "Rp 389.000",
        "Rp 320.000",
        "Rp 399.000",
        "Rp 430.000",
        "Rp 2.350.000"
    )

    private val sbImages = intArrayOf(
        R.drawable.ic_amazfitcor2,
        R.drawable.ic_fitbit_charge4,
        R.drawable.ic_garmin_vivosmart4,
        R.drawable.ic_vivofit4,
        R.drawable.ic_honorband_5,
        R.drawable.ic_huaweiband_4,
        R.drawable.ic_miband_4,
        R.drawable.ic_realmeband,
        R.drawable.ic_samsungfit_e,
        R.drawable.ic_samsung_gearfit2pro
    )

    private val sbDeskripsi = arrayOf(
        "AmazFit Cor 2 baru menunjukkan sisi yang kurang elegan tapi mungkin lebih kuat dan sporty sambil menawarkan Layar LCD warna 1,23 inci dengan resolusi 160 x 80 jenis piksel sentuh dan dengan Pemrosesan 2.5D. Semuanya tertutup dalam tubuh polikarbonat yang memberi bobot rendah hanya gram 32, sedangkan talinya terbuat dari karet dengan lebar dari 20 mm.\n" +
                "\nBaterai, unit dari 160 mAh, janji 20 hari otonomi dan ini ajaib jika kita berpikir bahwa generasi sebelumnya menawarkan 12 hari penggunaan intensif. AmazFit Cor 2 juga menawarkan sertifikasi IP68 hingga 5 ATM dan sebuah sensor NFC untuk melakukan pembayaran saat bepergian. Tidak ada kekurangan konektivitas Bluetooth 4.2 dan sensor cardio generasi baru dengan kemampuan pengukuran H24 dan akhirnya suite deteksi gerak dan pelacakan tidur menggunakan akselerometer sumbu 3.",
        "Dari segi desain, Fitbit Charge 4 terlihat sama persis dengan pendahulunya, punya layar sentuh 1,36 inci OLED hitam putih dengan sebuah tombol di sisi samping dan strap yang bisa diganti. Fitbit memberikan warna opsi baru yang dinamakan “rosewood”, seperti gabungan warna merah dan magenta gelap. Tentunya pengguna Fitbit Charge 3 yang hendak upgrade bisa menggunakan strap lama untuk perangkat baru ini.\n" +
                "\nFitbit Charge 4 juga tentu membawa semua fitur dari seri lawas, seperti Fitbit Pay, Sleep Score, Female Health Tracking dan SmartTrack exercise recognition yang otomatis mencatat kegiatan olahraga tapi perlu proses inisiasi lebih dulu. Notifikasi seperti pesan dan jadwal di kalender juga bisa tertampil pada layar kecilnya. Fitbit mengklaim jika Charge 4 mampu tahan selama satu minggu penggunaan, dan lima jam dengan GPS aktif berkelanjutan.",
        "Para wanita memiliki tingkat stres yang lebih tinggi dibandingkan dengan lelaki. Smartband ini memiliki sensor yang dapat menunjukkan tingkat stres Anda seharian. Relax reminder-nya membantu mengingatkan Anda ketika tingkat stres sedang tinggi. Gunakan relaxation breathing timer untuk menenangkan tubuh dan pikiran Anda.\n" +
                "\nDesain smartwatch dari Garmin ini memang sangat menawan bagi para wanita. Di samping ukurannya yang ramping, aksen bezel aluminium di sekitar layarnya membuat tampilannya lebih mewah. Selain untuk berolahraga, Anda juga dapat menggunakannya ketika menghadiri acara bersama rekan-rekan.",
        "Soal kelengkapan fitur, Garmin Vivofit 4 memiliki layar always-on berwarna yang berfungsi untuk menampilkan informasi seputar aktivitas, notifikasi, cuaca, dan yang lainnya. Pengguna juga bisa menyesuaikan tampilkan muka jam, tema warna, dan teks melalui aplikasi Garmin Connect.\n" +
                "\nBerbekal teknologi Move IQ, Vivofit 4 akan secara otomatis mendeteksi setiap langkah yang dilakukan penggunanya, berapa jarak yang sudah ditempuh, dan berapa kalori yang terbakar. Bahkan, aktivitas seperti bersepeda atau berenang pun bisa terdeteksi.",
        "Sering kali Anda merasa bosan dengan tampilan layar smartwatch yang begitu saja. Sekarang Anda dapat memilih tampilan layar sesuka hati Anda di Honor Clock Face Store untuk Honor Band 5. Tampilannya sangat trendi dan kekinian untuk digunakan kapan saja.\n" +
                "\nSmartband ini sangat cocok untuk Anda yang menyukai renang karena memiliki six-axis sensor. Sensor cerdas tersebut dapat mendeteksi gerakan renang, kecepatan, jarak, dan kalori Anda. Tidak hanya itu saja, nilai swim golf  (SWOLF) juga dapat dihitung agar Anda dapat mengukur kemampuan renang Anda.",
        "Semakin banyak device yang Anda gunakan, maka semakin banyak juga kabel yang dibutuhkan. Namun, smartband yang satu ini tidak membutuhkan kabel untuk pengisian daya baterai. Built-in USB plug dari Huawei Band 4 ini dapat langsung Anda colokkan ke USB umum. \n" +
                "\nSmartband ini memiliki fitur TruSleep 2.0 yang dapat mengetahui empat fase tidur melalui detak jantung. Data tersebut kemudian dapat digunakan untuk menganalisis kualitas tidur serta dapat mengidentifikasi enam masalah tidur. Aplikasi Huawei juga menyediakan solusi untuk tidur yang lebih baik. Andalan untuk Anda yang sulit tidur dan ingin smartband yang lebih praktis.",
        "Smartband ini dapat menemani sobat rebahan yang ingin mulai aktif bergerak. Fitur peringatan diam akan bergetar jika Anda terlalu lama berdiam dan tidak bergerak. Tidak hanya itu, ada enam aktivitas olahraga yang dapat dideteksi, seperti berjalan, berlari outdoor, bersepeda, berenang, treadmill, dan training.\n" +
                "\nDaya baterai ya ng tahan lama membuatnya dapat mengukur detak jantung Anda selama 24 jam dalam 7 hari. Jika detak jantung Anda terlalu tinggi karena berolahraga, perangkat ini juga bisa mengingatkan Anda agar dapat beristirahat sejenak. Xiami Mi Band 4 juga dapat mendeteksi pola tidur Anda. Hidup lebih sehat dan bugar sejak dini!",
        "Realme Band adalah perangkat aksesori AIoT (artificial intelligence of things) yang dihadirkan realme di Indonesia, setelah sebelumnya merilis earphone TWS, realme Buds Air. Palson Yi, Marketing Director realme Indonesia mengatakan dengan realme band, pengguna seolah-olah memiliki pemantau kesehatan dan kebugaran pribadi yang mengingatkan tentang kegiatan sehari-hari seperti monitor detak jantung real-time, sleep quality monitor dan idle-alert.\n" +
                "\nBaterai 90 mAh diklaim sanggup menyala hingga 9 hari pemakaian, dan pengisian dayanya pun cukup mudah. Tak memberikan kabel charger dalam paket penjualan, realme Band sudah dilengkapi port male USB-A pada bagian bodinya. Lepas strap bagian bawah, dan colok perangkat ke port USB yang ada di rumah maupun powerbank, praktis tanpa perlu takut kehilangan charger khusus.\n",
        "Menggunakan smartband tentu tidak boleh sampai mengganggu pergerakan tangan Anda ketika berolahraga. Smartband keluaran Samsung ini memiliki bobot yang ringan, hanya 15 gram. Anda juga dapat menghadiahkannya bagi orang tua Anda karena ringan di tangan orang berumur. Tampilan layar yang minimalis mempermudah melihat status kebugaran Anda.",

        "Samsung berkolaborasi dengan berbagai aplikasi dalam Gear Fit 2 Pro, seperti UA Record, MapMyRun, MyFitness Pal, dan Endomondo. Pencatatan asupan kalori, perencanaan rute lari, wawasan tentang kesehatan tubuh dapat tercatat dengan akurat.\n" +
                "\nSuka mendengarkan musik ketika berolahraga? Anda tidak perlu lagi repot membawa smartphone karena Anda dapat mendengarkannya melalui Spotify di device yang satu ini. Dilengkapi dengan bluetooth, Anda dapat menyambungkannya dengan headphone kesayangan Anda."
    )

    private val sbDisplay = arrayOf(
        "80 x 160 pixels ~ 1.23 inch",
        "160 x 100 pixel ~ 1 inch",
        "48 x 128 pixel ~ 0.75 inch",
        "88 x 88 pixel ~ 0.43 inch",
        "120 x 240 pixel ~ 0.95 inch",
        "80 x 160 pixel ~ 0.96 inch",
        "120 x 240 pixel ~ 0.95 inch",
        "160 x 180 pixel ~ 0.96 inch",
        "64 x 128 pixel ~ 0.74 inch",
        "216 x 432 pixel ~ 1.5 inch"
    )

    private val sbFitur = arrayOf(
        "Bluetooth 4.2, 5 ATM, NFC, Pedometer, Heart Rate Monitor, Alarm Clock, Call Notification",
        "Bluetooth 4.0, 5 ATM, NFC,  female health trackin, personalised guided breathing, Built in GPS, Mode Fitness, Sleep Tracking, Spotify Control, Fitbit App",
        "Bluetooth 4.0, 5 ATM, Alat pemantauan kebugaran,  pelacakan stres sepanjang hari, pengatur waktu relaksasi pernapasan, VO2 max, monitor energi Body Battery™, sensor Pulse Ox3",
        "Bluetooth 4.0, 5 ATM, Melacak langkah, jarak dan kalori yang terbakar, memonitor tidur, Garmin Move IQ",
        "Bluetooth 4.2, 5 ATM, NFC, Clock, heart rate monitor, Sp O2, TruSleep, six axis sensor, message reminder, phone finder, remote picture taking, remote music control.",
        "Bluetooth 4.2, 5 ATM, Clock, heart rate monitor, Tru Sleep, step counter, distance counter, speed counter, calorie counter",
        "Bluetooth 5.0, 5 ATM, NFC, Clock, alarm, hear rate monitor, sleep tracker, 6 activity mode, calory burned counter, step counter, night mode, reminder to move",
        "Bluetooth 4.2, Real-time heart rate monitor, IP68 rating, USB-A connector, Sleep Tracking, Sports Tracking, Step Counter, Smart Notifications, Idle Alert, Drink Reminder",
        "Bluetooth 5.0, 5 ATM, Clock, heart rate monitor, activity tracker, sleep tracker",
        "Bluetooth 4.2, 5 ATM, Clock, alarm, stopwatch, heart rate monitor, step counter, calories burned, UA Record, MapMyRun, MyFitnessPal, Endomondo, Spotify, moves count, GPS, bluetooth, wifi"
    )

    private val sbbaterai = arrayOf(
        "160 mAh",
        "up to 7 days",
        "up to 7 days",
        "up to 1 years",
        "100 mAh",
        "91 mAh",
        "135 mAh",
        "90 mAh",
        "70 mAh",
        "200 mAh"
    )

    private val sbLink= arrayOf(
        "https://www.youtube.com/embed/bYWO7bZen7A",
        "https://www.youtube.com/embed/YVmrsyfoFcg",
        "https://www.youtube.com/embed/8Ne1ykOut34",
        "https://www.youtube.com/embed/55u0bxKdUyY",
        "https://www.youtube.com/embed/YbpDnQvoBY0",
        "https://www.youtube.com/embed/C3mnq9i9VL0",
        "https://www.youtube.com/embed/RYyBzfE8O6g",
        "https://www.youtube.com/embed/fgWdYKhfgfk",
        "https://www.youtube.com/embed/86mGlfhNz6I",
        "https://www.youtube.com/embed/W8L3X5Av1ms"
    )

    val listData: ArrayList<Smartband>
        get() {
            val list = arrayListOf<Smartband>()
            for (position in sbName.indices) {
                val sb = Smartband()
                sb.nama = sbName[position]
                sb.harga = sbharga[position]
                sb.foto = sbImages[position]
                sb.deskripsi = sbDeskripsi[position]
                sb.fitur = sbFitur[position]
                sb.display = sbDisplay[position]
                sb.baterai = sbbaterai[position]
                sb.link = sbLink[position]
                list.add(sb)
            }
            return list
        }
}