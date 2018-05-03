#ifndef __MAIN_H__
#define __MAIN_H__

#include <windows.h>

/*  To use this exported function of dll, include this header
 *  in your project.
 */

#ifdef BUILD_DLL
    #define DLL_EXPORT __declspec(dllexport)
#else
    #define DLL_EXPORT __declspec(dllimport)
#endif


#ifdef __cplusplus
extern "C"
{
#endif

struct myfriend
{
    int age;
    char name[20];
    char friendname[30];
};

int DLL_EXPORT addFunction(int a,int b);

void DLL_EXPORT print(char* a);

void DLL_EXPORT addfunction2(int a ,int b, int *c);

void DLL_EXPORT findfrend(myfriend *mf);

#ifdef __cplusplus
}
#endif

#endif // __MAIN_H__
