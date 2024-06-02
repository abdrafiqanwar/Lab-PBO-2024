package No1;

public class BackgroundThread implements Runnable{
    protected int failedLoaded = 0; // diinisialisasi dngn nilai 0.utk melack jmlh operasi yg gagal.

    @Override
    public void run() {
        int time = TaskTimeHelper.getAngkaRandom(); //menyimpan nilai yg dihasilkan oleh metode getAngkaRandom dari kelas TaskTimeHelper.

        try { //utk mnan eksekusi thread selama time detik (time * 1000 milidetik).
            Thread.sleep(time * 1000);
            if (time > 4) {
                System.out.println("Request Timeout");
                setFailedLoaded(failedLoaded++); //mngktkan nilai failedLoaded dngn memanggil mtde setFailedLoaded.
            } 
        } catch (InterruptedException e) {
            e.printStackTrace(); //kalo terganggu mencetak ini
        }
        throw new UnsupportedOperationException("Unimplemented method 'run'"); //dilempr ksni trus nunjukkin ini mtde blm dimplemntsikn
    }

    public int getFailedLoaded() {
        return failedLoaded;
    }
    public void setFailedLoaded(int failedLoaded) {
        this.failedLoaded = failedLoaded;
    }
}