# Array
Đối với bài này, chủ yếu sẽ thực hiện các yêu cầu giải các bài tập đối với mảng 1 chiều. Dữ liệu được cho ở 
dạng các số nguyên.

## Running sum - Tổng tích lũy 

Bài này thì tương đối đơn giản. Chúng ta có định nghĩa một tổng tích lũy `i` của một mảng `nums` là tổng tất 
cả phần từ bắt đầu từ phần tử đầu tiên của mảng cho đến phần tử thứ `i`.

* **Cách 1**: Với cách làm đơn giản chúng ta có thể làm theo một cách "khá ngây thơ" là chạy từ đầu mảng cho 
tới cuối mảng. sau đấy thực hiện thao tác cộng các phần tử lại đến phần tử thứ `i` và rồi gán tại vị trị `i`. 
Cách này đúng, nhưng chưa ổn. Vì chúng ta phải thực hiện việc tính toán các dãy con nhiều lần trong cùng một 
chương trình.

**Code**
```java
public static int[] runningSum(int[] nums) {
	int[] result = new int[nums.length];
    for(int i = 0; i < nums.length; i++){
		for(int j = 0; j <= i; j++){
			result[i] += nums[j];
		}
    }
	return result;
}
```
* **Cách 2** Chúng ta nhận thấy rằng, khi chạy vòng lặp, chúng ta phải thực hiện lại thao tác tính tổng tích 
lũy đến`i-1` điều mà chúng ta đã làm ở bước trước. Bên cạnh đó, tổng tích lũy tại `i` sẽ bằng tổng tích lũy 
tại bước`i-1` + phần tử tại vị trí `i`. Chính vì cách tốt nhất là chúng ta sẽ lấy kết quả của bước trước cộng 
với giá trị của phần tử tại vị trí `i` sau đó gán vào mảng. Lặp lại thao tác này từ phần tử thứ 2 (index = 1) 
vì tổng tích lũy tại `i` chính bằng giá trị tại vị trí `i`.

**Code**
```java
public static int[] runningSum(int[] nums) {
	for (int i = 1; i < nums.length; i++){
		nums[i] += nums[i - 1];
	}
	return nums;
}
```

> **_Lưu ý:_** trong phần này chương trình thực hiện gán trực tiếp vào mảng gốc mà không sợ bị ảnh hưởng vì 
sau chương trình này không thực hiện thêm thao tác nào khác. Nếu trong trường hợp là một bài khác có sử dụng 
lại mảng nums nguyên gốc thì chúng ta nên tạo và gán giá trị sang một mảng mới

## Build Array - Xây dựng mảng
Bài này thì nhìn thì có vẻ tương đối khó hiểu. Tuy nhiên khi xét kỹ lại thì bài toán tương đối dễ để triển 
khai Đề bài yêu cầu tạo một mảng `ans` có cùng kích thước và `ans[i] = nums[nums[i]]`. Công việc khá đơn giản 
và dễ hiểu khi chúng ta nghĩ kĩ. Chúng ta chỉ cần chạy một vòng lặp từ đầu mảng `ans` đến cuối mảng. Với phần 
tử chạy là i`. Khi đó chúng ta chỉ cần gán `ans[i] = nums[nums[i]]` theo đúng như những gì đề bài yêu cầu là 
được.

> **_Lưu ý_**: Với bài này các phần tử trong mảng ```nums``` đều thỏa mãn tính chất `0<=nums[i]<nums.length` 
cho nên không cần quan tâm đến việc kiểm tra xem phần tử có phải là một giá trị thỏa mãn không.

**Code**
```java
public static int[] buildArray(int[] nums){
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++){
        ans[i] = nums[nums[i]];
    }
    return ans;
}
```

## Shuffle - Xáo trộn phần tử trong mảng
Với bài này thì sẽ thấy hơi phức tạp hơn một chút so với bài trước. Chúng ta sẽ cần xáo trộn các phần tử 
thành. `[x1,y1,x2,y2,...,xn,yn]` với mảng gốc cho theo dạng là `[x1,x2,...,xn,y1,y2,...,yn]`.

Chúng ta để ý thấy phần tử `xi` và `yi` cách nhau chính xác là `n` vị trí. Chính vì thế ta sẽ chỉ cần duyệt 
mảng `nums` từ `1 - n`. Để ý thấy tại mảng mới `index` sẽ tăng 2 lần 1. Tức là sau mỗi bước lặp ta tăng 
`index` lên 2 thay vì 1 như thông thường. Vì thế ta cần ít nhất là 2 biến (con trỏ) để trỏ tới 2 vị trí khác 
nhau. Với biến thứ nhất tham chiếu tới vị trí của phần tử tại mảng `nums` biến thứ 2 tham chiếu tới vị trí 
tại mảng kết quả. Với con trỏ thứ 2, sẽ là biến lặp được tăng 2 lần như đã đề cập ở trên. khi này phần tử thứ 
`i` sẽ có giá trị là `xi` và phần tử `i+1` có giá tr là `yi`.

**Code**
```java
public static int[] shuffle(int[] nums, int n) {
	int[] result = new int[nums.length];
	int index = 0;
	for (int i = 0; i < n; i++){
		result[index] = nums[i];
		index++;
		result[index] = nums[n + i];
		index++;
	}
	return result;
}
```
## Search insert - Tìm kiếm vị trí chèn.
Với bài này các bạn có thể suy nghĩ đến cách duyệt từ đầu mảng từ `0->n-1`. Cách này đúng nhưng không hoàn 
toàn hiệu quả. Dễ thấy rằng việc tìm kiếm theo cách này là đúng nhưng với số lượng dữ liệu lớn thì tốc độ sẽ 
rất chậm. Bên cạnh đó rất có thể các bạn sẽ không chạy được đáp án đúng nếu làm theo cách này vì đầu vào là 
một dãy ` Không` giảm tức là có phần tử trùng lặp. Điều này có thể khiến các bạn khó chịu, tuy nhiên điều này 
cũng có nghĩa là thuật toán của các bạn đang sai theo nghĩa đây là một thuật toán không hiệu quả. Nhận thấy, 
dãy đã được sắp xếp chính vì vậy có thể thực hiện tìm kiếm nhị phân để tìm ra vị trí của phần tử `target`. 
Tuy nhiên với trường hợp không tìm thấy thì sao? Ta nhận thấy, thuật toán tìm kiếm nhị phân sẽ kết thúc khi 
không thể tìm được vị trí của `target`. Và khi này biến bên trái hoặc phải (tùy theo cách triển khai) sẽ đúng 
bằng vị trí cần tìm. Điều này đúng vì khi ở vị tr cuối cùng của vòng lặp. `left = right`chúng ta sẽ có là 
`mid = left - (right - left) / 2`. Tùy theo cách cài đặt thì giá trị có thể đẩy lệch. Điều này xảy ra
Khi cài đặt khối bend `if-else` không phù hợp. Vì thế khi cài đặt tùy theo điều kiện so sánh của `target` bên 
trái hay bên phải `mid` mà sẽ có phương án trả về phù hợp. Nếu so sánh `right` trước thì sẽ trả về `left` sau 
vòng lặp và trả về`right` nếu ngược lại.

_Ví dụ:_

Giả sử input đầu vào cho mảng `nums = [11, 12, 13, 14, 16, 17, 18, 19]` và `target=15`

Qua mỗi bước lặp phạm vi so sánh `[left,right]` sẽ là:
* `mid = 3` so tìm kiếm trên đoạn `[0, 7]`
* `mid = 5` so tìm kiếm trên đoạn `[4, 7]`
* `mid = 4` so tìm kiếm trên đoạn `[4, 5]`
* `mid = 4` so tìm kiếm trên đoạn `[4, 4]`

Tại bước tiếp theo `left > right` nên chương trình thuật toán sẽ dừng. Giá trị các biến lúc này là: `left = 
4, right = 3` Lúc này ta thấy giá trị của biến `left` chính xác bằng vị trí cần chèn. `nums[left] = 16` `nums
[left - 1] = 14` `->` vị trí thích hợp nhất chính là `left` vì khi trèn thì phần tử tại hiện tại là 
`16` sẽ lệch lên trên và như thế giá trị của mảng sẽ vừa đúng là `...14, 15, 16...`

**Code**
```java
public static int searchInsert(int[] nums, int target) {
      int start = 0;
      int end = nums.length - 1;
      int mid = end / 2;
      while (start <= end) {
          if (target < nums[mid]) {
              end = mid - 1;
          } else if (target > nums[mid]) {
              start = mid + 1;
          } else {
              return mid;
          }
          mid = start + (end - start) / 2;
      }
      return start;
  }
```

## Plus One - Cộng một

Với bài này thì sẽ khá là giống việc chúng ta tính toán như hồi ở tiểu học. Khi mà việc của chúng ta cần làm 
là thực hiện các phép tính lần lượt từ phải sang trái. Điều cần lưu ý ở đây là việc tính toán không quá phức 
tạp chủ yếu cần lưu ý trường hợp có nhiều số 9 hoặc toàn số 9 thì sẽ phức tạp hơn khi phải thực hiện một vòng 
lặp quanh mảng. 

Ý tưởng của bài này khá đơn giản, ta sẽ duyệt từ cuối mảng lên (Tương tự như việc xét các số từ phải qua trái 
như các tính toán thông thường trong toán học). Ta sẽ xét các số `digits[i]` nếu số này khác 9 thì chúng ta 
sẽ +1 và ngay lập tức dừng vòng lặp và trả về mảng `digits` hiện tại. Ngược lại, nếu giá trị hiện tại là 9 
chúng ta sẽ gán nó bằng 0 và chuyển sang bước lặp tiếp theo. Lặp lại đến khi hết phần tử hoặc khi gặp số đầu 
tiên khác 9. Trong trường hợp một mảng toàn số 9 hay ta đã phải duyệt hết mảng, thì lúc này ta phải khởi tạo 
một mảng mới với kích thước bằng `digits.length + 1` và gán phần tử đầu tiên là bên trái là 1.

_Ví dụ:_ Cho `digits = [9,9,9] -> 999` thực hiện +1 vào mảng thì dữ liệu sẽ biến thành 1000 hay `digits = [1,
0,0,0]`

**Code**
```java
public static int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--){
        if (digits[i] < 9){
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
}
```

# Matrix

Với các dạng bài ở đây, không quá khó để có thể xác định yêu cầu cũng như hướng giải chi tiết. Với các dạng 
bài này tương đối dễ để có thể để hình dung mình sẽ phải làm gì

## reshape - Thay đổi kích thước ma trận

Với bài này chúng ta cần xác định các điều sau:
* Ma trận mới phải có số lượng phần tử bằng chính xác ma trận cũ `->` ma trận mới có số lượng phần tử bằng ma 
trận cũ. Hay nói cách khác là `n*m == r*c` với `n,m` lần lượt là số hàng và số cột của ma trận. Điều này có 
nghĩa là chúng ta phải kiểm tra xem ma trận gốc có phù hợp với dữ liệu đầu vào hay không? hay có thể thay đổi
kích thước hay không rồi mới bắt đầu thực thi chương trình.
* Khác với các bài khác, bài này thì ma trận sẽ đặc biệt hơn nhiều so với ma trận cũ. Chúng ta vừa phải truy 
vấn tới ma trận gốc vừa phải truy vấn tới ma trận mới bằng hàng và cột. Điều này có nghĩa là chúng ta phải 
truy vấn tới hàng và cột của 2 ma trận 1 cách riêng biệt.

* Cách 1: sử dụng 4 biến để truy vấn riêng biệt. Cách này về cơ bản đúng và giá trị là không thay đổi. Tuy 
nhiên vấn đề là làm sao để cài đặt? Điều đầu tiên ta cần lưu ý là chúng ta vẫn phải dùng 2 vòng lặp để duyệt 
mảng gốc hoặc mảng mới tùy theo cách cài đặt (Trong cách này sẽ mặc định dùng 2 vòng lặp để truy vấn tới mảng 
gốc). Sau đấy các giá trị tăng dần tuy nhiên sẽ phải kiểm tra điều kiện của biến truy vấn tới cột của ma trận 
mới (gọi là `col` để phân biệt với biến truy vấn tới cột của ma trận gốc là `j` - dạng đầy đủ sẽ là 
`ans[row][col]` và `matrix[i][j]`) xem xem nó có đang vượt quá giới hạn hay không? nếu có sẽ gán về 0 và tăng 
biến `row` lên 1 và ngược lại sẽ tiếp túc tăng giá trị của `col` lên 1. Chương trình sẽ dừng sau khi kết thúc 
2 vòng lặp và đã duyệt xong tất cả các phần tử cùng với vị trí của các phần tử đó.

**Code**

```java
public static int[][] reshape(int[][] matrix, int r, int c){
    if (matrix.length * matrix[0].length != r * c){
        return matrix;
    }
    int row = 0;
    int col = 0;
    int[][] ans = new int[r][c];
    for (int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
            ans[row][col] = matrix[i][j];
            if (col >= c - 1){
                col = 0;
                row++;
            }else{
                col++;
            }
        }
    }
    return ans;
}
```

* Cách 2: Là một phiên bản cải tiến khác của cách 1. Chúng ta vẫn làm các thao tác tương tự như cách một. Tuy 
nhiên chúng ta thay vì dùng 2 biến `row,col` như ở cách một mà chúng ta chỉ dùng duy nhất một biến `index`.
Lý thuyết của cách này là sử dụng 1 biến, một vòng lặp để truy vấn tới ma trận. Ta nhận thấy rằng, ta cho một 
biến xuất phát từ 0 và tăng dần thì các phần tử có `col = 0` sẽ tương ứng ở đầu các hàng. Số thứ tự của một 
giá trị trong ma trận tương ứng là vị trí của nó khi ta đếm từ trái sang phải và từ trên xuống dưới. Điều này 
có nghĩa là chúng ta đang sử dụng biến `index` tương ứng là số thứ tự của phần tử nếu được chuyển về dạng 
mảng. Nếu ép phẳng ma trận gốc thành một mảng theo quy tắc trái sang phải trên xuống dưới (Ta tạm gọi mảng 
này là `arr`) rồi sau đấy mới lấy từng phần tử gán vào ma trận. Ta sẽ sẽ nhận ra rằng, `c` phần tử đầu tiên 
của `arr` sẽ tương ứng là hàng đầu tiên của ma trận. Tương tự như thế thì các phần tử tiếp theo sẽ đi thành 
`r` bộ gồm `c` phần tử. Để ý thấy số thứ tự của phần tử đầu tiên tại mỗi hàng (hay là phần tử đầu tiên của 
các bộ gồm `c` phần tử) chia hết cho `c` hay nói cách khác là phần dư = 0. Điều này chứng tỏ rằng khi ta lấy 
`index % c` thì ta sẽ truy vấn được đến chính xác cái cột ở mảng `ans`. Ta lại có, phần nguyên của phép chia
`index` cho `c` sẽ là số hàng bởi vì khi chưa đủ `c` số, giá trị này sẽ không tăng mà chỉ khi chúng ta chọn 
được đúng chính xác `c` số thì phần nguyên này mới tăng lên.

> Lưu ý: Có thể sẽ có bạn thắc là nếu không thể chia được thành `r` bộ gồm `c` phần tử thì sao? Điều này đã 
được chúng ta loại trừ đi khi kiểm tra điều kiện đầu tiên. Hay nói các khác chúng ta chỉ có thể chia thành 
các bố khi và chỉ khi `n*m == r*c`

**Code**

```java
public static int[][] reshape(int[][] matrix, int r, int c){
    if (matrix.length * matrix[0].length != r * c){
        return matrix;
    }
    int n = matrix.length;
    int m = matrix[0].length;
    int index = 0;
    int[][] ans = new int[r][c];
    for (int i = 0; i < ans.length; i++){
        for(int j = 0; j < ans[0].length; j++){
            ans[i][j] = matrix[index / m][index % m];
            index++;
        }
    }
    return ans;
}
```

> Lưu ý: Trong trường hợp không hoàn toàn hiểu bài này, có thể đọc thêm bài phía dưới là bài Convert to Array
để hiểu rõ hơn về bài này nhé

## Lower Triangle Matrix - Ma trận tam giác dưới

Bài này thì không quá phức tạp, tương tự như cách ta tìm ma trận tam giác trên như hôm trước. Điều đáng chú ý 
là điều kiện sẽ ngược lại so với bài trước. Tất cả các phần tử trong ma trận tam giác dưới mà nằm phía trên 
đường chéo trình đều sẽ có giá trị bằng 0. Nhận thấy các phần tử nằm dưới đường chéo chính đều có giá trị 
hàng > giá trị cột. Hay nói cách khác là nếu phần tử có `i<j` thì sẽ gán bằng 0 và ngược lại ta sẽ giữ nguyên giá trị.

**Code**
```java
public static int[][] lowerTriangleMatrix(int[][] matrix){
    if (matrix.length != matrix[0].length){
        return matrix;
    }
    for (int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
            if (i < j){
                matrix[i][j] = 0;
            }
        }
    }
    return matrix;
}
```

## Convert To Array - Chuyển về mảng

Bài này với bài Reshape phía trên khá tương đồng với nhau. Chính vì thế nếu các bạn không hiểu hoặc không làm 
được bài trên thì có thể xem bài này để hiểu rõ hơn. Bài này sẽ đơn giản hơn khi chỉ cần phải chuyển về mảng 
một chiều. Điều này có nghĩa ta chỉ cần tạo thêm một biến nữa ngoài hai biến `i,j` (Tương ứng là hàng và cột 
của ma trận) để truy vấn tới mảng 1 chiều `arr`. Ta khởi tạo biến `index=0` bài này sẽ tương tự như việc 
chúng ta đếm xem có bao nhiêu phần tử trong ma trận. Chính vì thế công việc khá đơn giản khi chúng ta chỉ cần tăng biến `index` lên một mỗi khi chúng ta duyệt qua 1 phần tử trong mảng.

**Code**
```java
public static int[] convertToArray(int[][] matrix){
    int index = 0;
    int[] ans = new int[ matrix.length * matrix[0].length];
    for (int i = 0; i < matrix.length;i++){
        for(int j = 0; j < matrix[0].length; j++){
            ans[index] = matrix[i][j];
            index++;
        }
    }
    return ans;
}
```

## Columns Mean - Trung bình mẫu theo cột

Bài này thì tương đối dễ dàng gần như nếu gặp trong bài thi là một bài cho điểm. Chúng ta sẽ duyệt mảng này 
theo cách ngược lại một chút. Bình hường ta sẽ duyệt các phương thức theo hướng là duyệt `i` trước rồi mới 
tới `j`. Thì hay vì như thế chúng ta sẽ thực hiện duyệt theo `j` trước. Ở trong bài này thì ta sẽ lấy một cái 
tên mới cho biến `j` là `col` để code tường minh hơn. Ta xét lần lượt các cột sau đó tính tổng lại các giá 
trị có trong cột đó rồi sau đó đem chia cho số hàng của mảng ta sẽ được giá trị trung bình. Sau khi được giá 
trị trung bình của cột rồi ta gán vào `means[col]` tương ứng là giá trị trung bình tại cột `col`

**Code**
```java
public static int[] colMean(int[][] matrix){
    int[] means = new int[matrix[0].length];
    for (int col = 0; col < matrix[0].length; col++){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][col];
        }
        means[col] = sum / matrix.length;
    }
    return means;
}
```