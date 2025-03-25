import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int monthNumber = 0;
        // Yêu cầu nhập tháng cho đến khi dữ liệu hợp lệ
        while (monthNumber == 0) {
            System.out.print("Nhập tháng (tên đầy đủ, viết tắt, 3 chữ cái hoặc số từ 1 đến 12): ");
            String monthInput = scanner.nextLine().trim();
            monthNumber = parseMonth(monthInput);
            if (monthNumber == 0) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
            }
        }
        
        int year = -1;
        // Yêu cầu nhập năm cho đến khi dữ liệu hợp lệ
        while (year < 0) {
            System.out.print("Nhập năm (số không âm, ví dụ: 1999): ");
            String yearInput = scanner.nextLine().trim();
            // Yêu cầu nhập đầy đủ các chữ số (ví dụ: năm 1999 phải nhập là "1999", không được nhập "99")
            if (!yearInput.equals("0") && yearInput.length() < 4) {
                System.out.println("Năm không hợp lệ (phải nhập đầy đủ các chữ số). Vui lòng nhập lại.");
                continue;
            }
            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("Năm phải là số không âm. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Năm nhập vào không hợp lệ. Vui lòng nhập lại.");
            }
        }
        
        // Tính số ngày của tháng dựa vào tháng và năm (xét trường hợp năm nhuận với tháng 2)
        int days = getDaysInMonth(monthNumber, year);
        System.out.println("Tháng " + monthNumber + " năm " + year + " có " + days + " ngày.");
        
        scanner.close();
    }
    
    /**
     * Phương thức parseMonth chuyển chuỗi nhập vào thành số tháng (1-12).
     * Nếu nhập số thì kiểm tra trong khoảng 1-12, nếu nhập chữ thì chuyển về chữ thường,
     * loại bỏ dấu chấm cuối (nếu có) và so sánh với các tên tháng hợp lệ.
     */
    public static int parseMonth(String input) {
        // Nếu là số
        try {
            int m = Integer.parseInt(input);
            if (m >= 1 && m <= 12) {
                return m;
            }
        } catch (NumberFormatException e) {
            // Không phải số, chuyển sang xử lý chuỗi
        }
        
        // Chuyển chuỗi về chữ thường và loại bỏ dấu chấm nếu có
        String monthStr = input.toLowerCase();
        if (monthStr.endsWith(".")) {
            monthStr = monthStr.substring(0, monthStr.length() - 1);
        }
        
        switch(monthStr) {
            case "january":
            case "jan":
                return 1;
            case "february":
            case "feb":
                return 2;
            case "march":
            case "mar":
                return 3;
            case "april":
            case "apr":
                return 4;
            case "may":
                return 5;
            case "june":
            case "jun":
                return 6;
            case "july":
            case "jul":
                return 7;
            case "august":
            case "aug":
                return 8;
            case "september":
            case "sept":
            case "sep":
                return 9;
            case "october":
            case "oct":
                return 10;
            case "november":
            case "nov":
                return 11;
            case "december":
            case "dec":
                return 12;
            default:
                return 0; // Nhập không hợp lệ
        }
    }
    
    /**
     * Phương thức getDaysInMonth trả về số ngày trong tháng,
     * xét trường hợp của tháng 2 với năm nhuận.
     */
    public static int getDaysInMonth(int month, int year) {
        switch(month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
    
    /**
     * Phương thức isLeapYear kiểm tra xem năm có phải năm nhuận không.
     * Một năm nhuận nếu chia hết cho 4 và không chia hết cho 100,
     * ngoại trừ năm chia hết cho 400.
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
