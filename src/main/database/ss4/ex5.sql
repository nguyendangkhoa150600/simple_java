# bt5
# a. Những học sinh có giới tính là Nam.
SELECT * FROM hoc_sinh WHERE gioi_tinh = 'nam';

# b. Những học sinh chưa có tên của phụ huynh.
SELECT * FROM hoc_sinh WHERE ho_ten_ph = '' OR hoc_sinh.ho_ten_ph IS null;

# c. Những lớp chưa có giáo viên chủ nhiệm.
SELECT * FROM lop WHERE ma_gvcn = '' OR ma_gvcn IS null;

# d. Những học sinh chưa được phân lớp.
SELECT * FROM hoc_sinh WHERE ma_lop = '' OR ma_lop IS null;

# e. Những học sinh nữ có địa chỉ ở Thanh Khê.
SELECT * FROM hoc_sinh WHERE dia_chi = 'Thanh khê' AND gioi_tinh = 'nu';

# f. Những học sinh nam có địa chỉ ở Hải Châu hoặc những học sinh nữ có địa chỉ ở Thanh Khê.
SELECT * FROM hoc_sinh WHERE (gioi_tinh = 'Nam' AND dia_chi = 'hai chau') OR (gioi_tinh = 'Nu' AND dia_chi = 'thanh khe');

# g. Những học sinh nam chưa có tên phụ huynh và những học sinh nữ chưa được phân lớp.
SELECT * FROM hoc_sinh WHERE (gioi_tinh = 'Nam' AND ho_ten_ph = '' OR ho_ten_ph IS null) OR (gioi_tinh = 'Nữ' AND ma_lop = '' OR ma_lop IS null);

# h. Những học sinh nam chưa được phân lớp và những học sinh nam chưa có tên phụ huynh.
SELECT * FROM hoc_sinh WHERE (gioi_tinh = 'Nam' AND ma_lop = '' OR ma_lop IS null OR ho_ten_ph = '' OR ho_ten_ph IS null);

# i. Mã môn học của những môn học được dạy trong học kỳ 2.
SELECT ma_mh FROM phu_trach_bo_mon WHERE hoc_ky like 'hoc ky 2';
