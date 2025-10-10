# Latihan Soal

<h3> Nama: Aylafada Syakira <h3>
<h3> NIM: 254107020116 <h3>
<h3> Kelas: TI-1C <h3>

## Soal 
1. Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi online, maka boleh masuk.
    • Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk. Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!
2. Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:
    • Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”.
    • Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS yang diambil:
        o Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”.
        o Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.
    • Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”. Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

## Jawaban

1. Berikut flowchart soal nomor 1:
   <img width="426" height="531" alt="Screenshot 2025-10-08 100832" src="https://github.com/user-attachments/assets/2e26119d-c341-4977-9ad0-82d2aa121914" />

    Berikut Pseudocode soal nomor 1: 
 START
 DEKLARASI boolean ktm, registrasi;
 
INPUT ktm 
INPUT registrasi
 
 IF (ktm = "Ya" OR registrasi = "Ya" )
    PRINT "Boleh masuk"
 ELSE 
    PRINT "Dilarang masuk"
END

2. Berikut flowchart soal nomor 2:
   <img width="585" height="760" alt="Screenshot 2025-10-09 194511" src="https://github.com/user-attachments/assets/8bc84a06-b8b0-40c4-b44e-d6f166891b16" />

    Berikut Pseudocode soal nomor 2: 
START
DEKLARASI String jenisPengguna, Int SKS

PRINT "Apakah jenisPengguna = (dosen/mahasiswa/lainnya): "
INPUT jenisPengguna

IF jenisPengguna = "dosen" 
    PRINT "Akses wifi diberikan (dosen)"
ELSE IF Apakah jenisPengguna = "mahasiswa"
    PRINT "Masukkan jumlah SKS yang diambil: "
    INPUT SKS

    IF (SKS >=12)
        PRINT "Akses wifi diberikan (mahasiswa aktif)"
        ELSE "Akses ditolak"
    ELSE 
    OUTPUT "Akses ditolak"

ELSE 
    OUTPUT "Akses ditolak"
END
