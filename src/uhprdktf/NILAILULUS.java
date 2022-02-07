/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhprdktf;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NILAILULUS {

    Scanner M = new Scanner(System.in);
    String nama;
    String nama1;
    String Ending;
    String S_input;
    int Nilai;

    void NM2() {
        nama1 = "Tuliskan Nama Anda :";
        System.out.print(nama1);
    }

    void NamaSiswa() {
        nama = "Silahkan Masukkan Nilai :";
        System.out.print(nama);

    }

    void ED() {
        Ending = "Hasil : ";
        System.out.println("Nama Anda : " + S_input);
        System.out.print(Ending);
    }

    void NL() {
        if (Nilai > 80) {
            System.out.println("Selamat Anda Lulus!!");

        }
        if (Nilai < 80) {
            System.out.println("Maaf Anda Tidak Lulus, Nice Try!!");
        }
    }

    void S() {
        S_input = M.nextLine();

    }

    void I() {
        Nilai = M.nextInt();
    }
}
