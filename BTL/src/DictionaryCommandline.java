import java.io.IOException;
import java.util.Scanner;
public class DictionaryCommandline{
    public DictionaryCommandline(){
       
    }
    static Scanner sc = new Scanner(System.in);
    // hien thi ket qua tu danh sach tu dien
    public void showAllWords(){
        System.out.printf("%-5s|%-20s|%-20s", "NO", "English", "Vietnamese" );
        System.out.println();
        for(int i = 0; i < Dictionary.word.size(); i++){
            System.out.printf("%-5s|%-20s|%-20s\n", i+1, Dictionary.word.get(i).getWord_target(), Dictionary.word.get(i).getWord_explain());
        }
    }
    // tim kiem chinh xac tuyet doi
    public void dictionarySearcher() {
    	System.out.println("Nhap tu tieng anh can tim:");
        sc.nextLine();
    	String str = sc.nextLine().toLowerCase();
    	int dem = 0;
    	for(int i = 0; i < Dictionary.word.size(); i++) {
            if(Dictionary.word.get(i).getWord_target().indexOf(str) == 0){
                System.out.print(dem + 1 + "\t");
    		Dictionary.word.get(i).displayWord();
    		dem++;
            }
    	}
    	if(dem == 0) {
    		System.out.println("Khong co tu can tim.");
    	}
    }
    public static void main(String[]args) throws IOException{
         String s = GoogleTranslate.translate("en","vi","beautiful");
         System.out.println(s);
    }
}