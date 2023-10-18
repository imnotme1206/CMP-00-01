#include<iostream>
using namespace std;

int main()
{
    int i , j ;
    string info ;
    string PerIn[5][4] ;
    
    for ( int i = 0 ; i < 5 ; i++ )
    {
        cout << "Information Sheet " << i+1 << endl << endl ;
        
        for ( int j = 0 ; j < 4 ; j++ )
        {
            if ( j == 0 )
            {
                info = "Name" ;
            }
    
            else if ( j == 1 )
            {
                info = "Age" ;
            }
    
            else if ( j == 2 )
            {
                info = "Address" ;
            }
    
            else if ( j == 3 )
            {
                info = "Gender" ;
            }
            
            cout << "Enter your " << info << " :  " ;
            cin  >> PerIn[i][j] ;
        }
        
        cout << endl << endl ;
    }
    
    cout << endl << endl << endl ;
    
    cout << "Display all Entered Information!" << endl << endl ;
    
    system ( "PAUSE" ) ;
    system ( "cls" ) ;
    
    for ( int i = 0 ; i < 5 ; i++ )
    {
        cout << "Information Sheet " << i+1 << endl << endl ;
        
        for ( int j = 0 ; j < 4 ; j++ )
        {
            if ( j == 0 )
            {
                info = "Name" ;
            }
    
            else if ( j == 1 )
            {
                info = "Age" ;
            }
    
            else if ( j == 2 )
            {
                info = "Address" ;
            }
    
            else if ( j == 3 )
            {
                info = "Gender" ;
            }
            
            cout << info << " :  " ;
            cout << PerIn[i][j] << endl ;
        }
        
        cout << endl << endl ;
    }
    
    
    return 0;
}