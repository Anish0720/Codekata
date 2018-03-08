#include<stdio.h>
#include<string.h>
int main(){
	char a2[100];
	char b1[20];
	int l,n,i;
	int t;
	scanf("%s",a2);
	scanf("%s",b1);
	 l=strlen(a2);
     n=strlen(b1);
     for(i=0;i<n;i++){
     	a2[l]=b1[i];
     	l++;
	 }
	 for(i=0;i<l;i++){
	 	printf("%c\n",a2[i]);
	 }
   
}
