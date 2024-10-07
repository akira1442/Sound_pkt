#include <stdio.h>
#include <stdlib.h>


typedef struct projet{
    // type (album, single, ep, mixtape)
    // date format jj/mm/aaaa
    // Chaque variable doit être allouer avec suffisement d'espace dans la fonction init

    char* type;
    char* nom;
    char* artiste;
    char* date;
    char* lien;
}Projet;

typedef struct musicL{
    Projet projet;
    struct musicL* suiv;
    struct music* prec;
};
