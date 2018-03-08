#include<stdio.h>
#include<string.h>
int main(){
	char aa[20];
	char b1[20];
	int l,n,i;
	int sum1=0;
	int sum2=0;
	scanf("%s",aa);
	scanf("%s",b1);
	 l=strlen(aa);
     n=strlen(b1);
     for(i=0;i<l;i++){
     	sum1=sum1+aa[i];
	 }
	  for(i=0;i<n;i++){
     	sum2=sum2+aa[i];
	 }
	 if(sum1>sum2){
	 	printf("%s\n",aa);
	 }
	 else{
	 	printf("%s\n",b1);
	 }
}
