# HelloApp – Aplikasi Sapa dengan Dark Mode

HelloApp adalah aplikasi Android sederhana yang memungkinkan pengguna
memasukkan nama, menampilkan sapaan, serta mengganti tampilan antara
Light Mode dan Dark Mode.  
Aplikasi ini dibuat menggunakan Android Studio dengan desain UI dominan
warna hijau muda.

---

## 🎯 Tujuan Aplikasi
- Menerapkan dasar UI Android menggunakan XML
- Menggunakan input pengguna (EditText)
- Navigasi sederhana antar tampilan
- Menerapkan Dark Mode menggunakan resource `values-night`
- Membuat project Android yang dapat dijalankan langsung dari repository GitHub

---

## 📱 Fitur Aplikasi
- Input nama pengguna
- Tombol **Sapa** untuk menampilkan pesan "Hello, {Nama}"
- Tombol **Back** untuk kembali ke halaman input
- Switch **Dark Mode / Light Mode** di pojok kanan atas
- Tampilan UI sederhana dan responsif

---

## 🛠️ Teknologi yang Digunakan
- Android Studio
- Bahasa: Java
- XML Layout
- Resource Theme (`themes.xml` dan `themes.xml (night)`)

---

## 📂 Struktur Project
```
HelloApp/
├── app/
│   └── src/main/
│       ├── java/com/example/helloapp/
│       │   └── MainActivity.java
│       ├── res/
│       │   ├── layout/
│       │   │   └── activity_main.xml
│       │   ├── values/
│       │   │   ├── colors.xml
│       │   │   └── themes.xml
│       │   └── values-night/
│       │       └── themes.xml
│       └── AndroidManifest.xml
├── gradle/
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md
```

---

## 🚀 Cara Menjalankan Aplikasi (STEP BY STEP)

### 1️⃣ Clone Repository
```bash
git clone https://github.com/USERNAME/HelloApp.git
```

---

### 2️⃣ Buka Project di Android Studio
1. Buka **Android Studio**
2. Pilih **Open**
3. Arahkan ke folder hasil clone repository
4. Klik **OK**

---

### 3️⃣ Tunggu Proses Gradle Sync
- Android Studio akan melakukan **Gradle Sync otomatis**
- Tunggu hingga muncul status **“Build Finished”**
- Jika muncul pop-up **Trust Project**, klik **Trust**

---

### 4️⃣ Jalankan Aplikasi
1. Hubungkan emulator atau perangkat Android
2. Pilih device di toolbar
3. Klik tombol **Run (▶)** atau tekan **Shift + F10**
4. Aplikasi akan terinstall dan berjalan otomatis

---

## 🧪 Cara Menggunakan Aplikasi
1. Masukkan nama pada kolom input
2. Tekan tombol **Sapa**
3. Aplikasi menampilkan teks **"Hello, [Nama]"**
4. Tekan tombol **Back** untuk kembali ke halaman input
5. Gunakan switch **Dark Mode** untuk mengganti tema aplikasi

---

## 🌗 Dark Mode
- Dark Mode menggunakan resource:
  - `res/values/themes.xml` (Light Mode)
  - `res/values-night/themes.xml` (Dark Mode)
- Warna otomatis berubah mengikuti mode sistem atau switch aplikasi

---

## 📸 Screenshot Aplikasi
(Tambahkan 2–3 screenshot tampilan aplikasi di sini)

---

## 👤 Identitas
- Nama: **Athaya Laily Syafitri**
- NIM: **2310817220008**
- Mata Kuliah: **Pemrograman Mobile**

---

## 📌 Catatan
Project ini dapat langsung dijalankan di Android Studio tanpa konfigurasi tambahan.
