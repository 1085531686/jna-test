#include "main.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// a sample exported function
int DLL_EXPORT addFunction(int a,int b)
{
   return a+b;
}
void DLL_EXPORT print(char* a)
{
    printf("hellew %s" ,a);
}

void DLL_EXPORT addfunction2(int a ,int b, int *c)
{
    *c = a+b;

}
void DLL_EXPORT findfrend(myfriend *mf)
{
     printf("friend_age %d\n" ,mf->age);
     printf("friend_name %s\n",mf->name);
     memset(mf->friendname,0,20);
     strcpy(mf->friendname,"lll_ss__ÄãºÃ");
     printf(" her_friend_name %s\n",mf->friendname);

}
extern "C" DLL_EXPORT BOOL APIENTRY DllMain(HINSTANCE hinstDLL, DWORD fdwReason, LPVOID lpvReserved)
{
    switch (fdwReason)
    {
        case DLL_PROCESS_ATTACH:
            // attach to process
            // return FALSE to fail DLL load
            break;

        case DLL_PROCESS_DETACH:
            // detach from process
            break;

        case DLL_THREAD_ATTACH:
            // attach to thread
            break;

        case DLL_THREAD_DETACH:
            // detach from thread
            break;
    }
    return TRUE; // succesful
}
