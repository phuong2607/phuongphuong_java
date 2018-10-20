import java.util.*;
import java.io.*;
public class DictionaryManagement{
    static Scanner sc = new Scanner(System.in);
    private static final String fileIN = "E:/dictionaries.txt";
    // nhap du lieu tu dien tu tep E:/dictionaries.txt
    // phuong thuc doc tu file
    public void insertFromFile(){
        try {
            File file = new File(fileIN);
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line;
            /* Đọc từng dòng (line) dữ liệu.
             Nếu đọc được null nghĩa là kết thúc */
            while ((line = in.readLine()) != null){
                Word w = new Word(line);
                Dictionary.word.add(w);
            }
            in.close();
            Dictionary.sort();
        }
        catch (IOException e){
        }
    }
    // xuat du lieu tu dien hien tai ra File
    public void dictionaryExportToFile() {
        BufferedWriter file = null;
        try {
            file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileIN), "UTF-8"));
            for(int i = 0; i < Dictionary.word.size(); i++) {
                file.write(Dictionary.word.get(i).getWord_target() + "\t" + Dictionary.word.get(i).getWord_explain());
                file.newLine();
            }
            file.close();
        }
        catch(IOException e) {
        }
    }  
    public void addWord(){
        String es = sc.nextLine();
        String vn = sc.nextLine();
        Word w = new Word(es, vn);
        Dictionary.word.add(w);
    }
    // nhap du lieu bang tay
    /* 
    nhập số từ bạn cần thêm vào từ điển
    nhập tiếng anh cần thêm vào, nhập nghĩa tiếng việt
    kiểm tra xem từ cần thêm có trùng với từ tiếng anh đã có sẵn không?
    Nếu có thì nhập lại. Ngược lại lưu từ cần thêm vào file.
    */
    public void insertFromCommandline(){
        System.out.println("Nhap so tu can them vao tu dien: ");
        int n = sc.nextInt();
        sc.nextLine();
        int i = 0;
            do{
                int checkInput = 0;
                System.out.println("Nhap tieng anh: ");
                String ES = sc.nextLine().toLowerCase();
                System.out.println("Nhap nghia tieng viet: ");
                String VN = sc.nextLine();
                VN = VN.trim();
                Word word1 = new Word(ES, VN);
                for(int j = 0; j < Dictionary.word.size(); j++){
                    if(ES.equals(Dictionary.word.get(j).getWord_target())){
                        checkInput = 1;
                        System.out.println("Tu can them da co trong tu dien. Nhap lai...");
                        break;
                    }       
                }
                if(checkInput == 1){
                    continue;
                }
                else{
                    i++;
                    Dictionary.word.add(word1);
                    Dictionary.sort();
                }
            }
            while(i < n);    
            
    }
    // tra cuu tu dien bang dong lenh
    public void dictionaryLookup(){
        System.out.println("Nhap tu can tim kiem:");
        sc.nextLine();
        String eng = sc.nextLine().toLowerCase();
        int dem = 0;
        for(int i = 0; i < Dictionary.word.size(); i++ ){
            if(eng.equals(Dictionary.word.get(i).getWord_target())) {
                System.out.print(dem + 1 + "\t");
                Dictionary.word.get(i).displayWord();
                dem++;
            }
        }
        if(dem == 0) {
            System.out.println("Khong co ket qua can tim.");
        }
    }
    // chinh sua tu dien
    public void editWord() {
        System.out.println("Nhap tu muon sua:");
        sc.nextLine();
        String editW = sc.nextLine().toLowerCase();
        for(int i = 0; i < Dictionary.word.size(); i++) {
            if(editW.equals(Dictionary.word.get(i).getWord_target())) {
                System.out.println("Tim thay tu can sua:");
                System.out.println("Nhap tu thay the:");
                String eng = sc.nextLine();
                String vn = sc.nextLine();
                vn = vn.trim();
                Word w = new Word(eng, vn);
                Dictionary.word.set(i, w);
                Dictionary.sort();
                return;
            }
        }
        System.out.println("Khong tim thay tu: " + editW);
    }
    // xoa tu
    public void deleteWord() {
        System.out.println("Nhap tu muon xoa: ");
        sc.nextLine();
        String deleteW = sc.nextLine().toLowerCase();
        for(int i = 0; i < Dictionary.word.size(); i++) {
            if(deleteW.equals(Dictionary.word.get(i).getWord_target())) {
                System.out.println("Da tim thay tu can xoa");
                System.out.println("Ban co muon xoa tu " + deleteW + " hay khong?\nAnswer: YES / NO");
                String answer = sc.next();
                if(answer.equals("YES")) {
                    Dictionary.word.remove(i);
                }
                else if(answer.equals("NO")) {
                    System.out.println("Ket thuc xoa.");
                }
                return;
            }
        }
        System.out.println("Khong tim thay tu can xoa");
    }
    
}