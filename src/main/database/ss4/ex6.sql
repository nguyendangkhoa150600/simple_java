
# a. Những học sinh có họ tên bắt đầu bằng từ Nguyễn.
    SELECT * FROM hoc_sinh WHERE ho_ten_hs LIKE 'Nguyen%';

# b. Những học sinh có họ tên kết thúc bằng từ Nở.
    SELECT * FROM hoc_sinh WHERE ho_ten_hs LIKE '%No';

# c. Những học sinh có họ tên chứa từ Thị.
    SELECT * FROM hoc_sinh WHERE ho_ten_hs LIKE '%Thi%';

# d. Những học sinh chứa từ Thị ở giữa (không được chứa ở đầu và ở cuối).
    SELECT * FROM hoc_sinh WHERE ho_ten_hs LIKE '%Thi%';

# e. Những học sinh có họ tên với độ dài là 30 ký tự (kể cả khoảng trắng).
    SELECT * FROM hoc_sinh WHERE LENGTH(ho_ten_hs) = 30;

# f. Những học sinh có họ tên với độ dài tối đa là 30 ký tự.
    SELECT * FROM hoc_sinh WHERE LENGTH(ho_ten_hs) <= 30;

# g. Những học sinh có họ tên với độ dài tối đa là 30 ký tự và bắt đầu bằng ký tự N.
    SELECT * FROM hoc_sinh WHERE ho_ten_hs LIKE 'N%' AND LENGTH(ho_ten_hs) <= 30;

# h. Những học sinh có họ tên bắt đầu bằng các ký tự: N, T, V.
    SELECT * FROM hoc_sinh WHERE ho_ten_hs LIKE 'N%' OR ho_ten_hs LIKE 'T%' OR ho_ten_hs LIKE 'V%';

# i. Những học sinh có họ tên không được bắt đầu bằng các ký tự: N, T, V.
    SELECT * FROM hoc_sinh WHERE ho_ten_hs NOT LIKE 'N%' OR ho_ten_hs NOT LIKE 'T%' OR ho_ten_hs NOT LIKE 'V%';

# j. Những học sinh có họ tên với phần họ có đúng 4 ký tự.
    SELECT * FROM hoc_sinh WHERE LENGTH(SUBSTRING_INDEX(ho_ten_hs, ' ', 1)) = 4;
