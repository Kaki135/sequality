package sequality;

public class Calculate{
public int sum(int x, int y) {
return x + y;
}
public int sum2(int x, int y) {
int total=0;
for(int i=x;i<=y;i++){
    total=total+i;
}
return total;
}


public int sumodd(int x, int y) {
int total=0;
for(int i=x;i<=y;i++){
    if(i%2!=0){
    total=total+i;
    }
}
return total;
}
public int sumeven(int x, int y) {
int total=0;
for(int i=x;i<=y;i++){
    if(i%2==0){
    total=total+i;
    }
}
return total;
}
}