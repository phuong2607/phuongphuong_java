public class testMain extends DictionaryCommandline{
    public static void main(String[] args){
          testMain m = new testMain();
          m.insertFromFile();
          int check;
          do {
        	  System.out.println("*------------Tu dien Anh Viet-----------*");
        	  System.out.println("1. Tra tu tuong doi");
                  System.out.println("2. Tra tu tuyet doi");
        	  System.out.println("3. Them tu");
        	  System.out.println("4. Sua tu");
        	  System.out.println("5. Xoa tu");
        	  System.out.println("6. In tat ca cac tu trong tu dien");
        	  System.out.println("7. Thoat ra ");
        	  System.out.println("Lua chon cua ban: ");
        	  check = sc.nextInt();
        	  switch(check) {
        	  		case 1:
        	  			m.dictionarySearcher(); // tim tu tuong doi
        	  			break;
                                case 2:
        	  			m.dictionaryLookup(); // tra tu tuyet doi
        	  			break;
        	  		case 3:
        	  			m.insertFromCommandline();
        	  			break;
        	  		case 4:
        	  			m.editWord();
        	  			break;
        	  		case 5:
        	  			m.deleteWord();
        	  			break;
        	  		case 6:
        	  			m.showAllWords();
        	  			break;
        	  }
        	  m.dictionaryExportToFile();
          }
          while(check >=1 && check <=6);
          
    }
}