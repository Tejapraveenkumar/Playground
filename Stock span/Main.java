#include<iostream>
using namespace std;
/*
int stockspan(int n, int arr[])
{
  for(int i=0;i<n;i++)
    cout<<arr[i]<<"\n";
}
int main()
{
  int z;
  cin>>z;
  int a[z];
  for(int i=0;i<=z;i++)
  {
    cin>>a[i];
  }
  int n=sizeof(a)/sizeof(a[0]);
  int S[n];
  S[0]=1;
  for(int i=1;i<=n;i++)
  {
    S[i]=1;
    for(int j=i-1;(j>=0)&&(a[i]>a[j]);j--)
    {
       S[i]++;
    }
  }
  stockspan(n,S);
}
*/
int main()
{
  int n,x=1,y=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<x;
  for(int i=1;i<n;i++)
  {
    if(a[i]<a[i-1])
      cout<<"\n"<<x;
    else
    {
      y+=2;
      cout<<"\n"<<y;
    }
  }
}