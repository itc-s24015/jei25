public class D51Q6 {
    public static void main(String[] args) {
        // 商品コードを直接定義
        String productCode = "BBB4010Y";

        // 実行例に合わせて商品データを修正
        Item[] li = { new Item("AA", "魚類"), new Item("BB", "肉類") };
        Item[] si = { new Item("A1", "さば"), new Item("A2", "さんま"),
                new Item("B1", "牛肉"), new Item("B2", "鶏肉"),
                new Item("B3", "豚肉"), new Item("B4", "加工肉") };

        ItemMaster im = new ItemMaster(li, si);
        String lcode = productCode.substring(0, 2);
        String scode = productCode.substring(2, 4);
        String details = productCode.substring(4);

        String lname = im.getItemName(im.MAJOR, lcode);
        String sname = im.getItemName(im.MINOR, scode);
        System.out.println("商品コード：" + productCode);
        System.out.println("大分類：" + lname);
        System.out.println("小分類：" + sname);
        System.out.println("詳細コード：" + details);
    }
}

class Item {
    private String code;
    private String name;
    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
}

class ItemMaster {
    public int MAJOR = 0;
    public int MINOR = 1;
    private Item[][] items;
    ItemMaster(Item[] major, Item[] minor) {
        items = new Item[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length; i++) {
            // バグを修正：codeとgetCode()を比較するように変更
            if (code.equals(items[codeLevel][i].getCode())) {
                return items[codeLevel][i].getName();
            }
        }
        return "(不明)";
    }
}