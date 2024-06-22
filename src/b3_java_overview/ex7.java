
a)
int i = 1, j = 1;
int a = i++ + j++;

a= 2;
i= 2;
j= 2;


b)
int i = 1, j = 1;
int a = i++ + ++j;

a=3;
i=2;
j=2;


c)
int i = 1, j = 1;
int a = ++i + j++;

a=3;
i=2;
j=2;


d)
int i = 1, j = 1;
a = ++i + ++j;

a=4;
i=2;
j=2;

e) 
int i = 1, j = 1;
int a = i++ + j++ + i++ + j++;

	a= 1 + 1 + 2 + 2;
a=6;
i=3;
j=3;


f)
int i = 1, j = 1;
int a = ++i + ++j + i++ + j++;

	a= 2 + 2 + 2 + 2;
a=8;
i=3;
j=3;


g)
int i = 1;
int a = i++ + ++i - i-- - --i;

	a= 1 + 3 - 3 - 1;
a=0;
i=1;

h)
int a = 10;
int a += a++ + ++a;

	a= a++ + ++a + a;
	 = 10 + 12 + 12
	 = 34