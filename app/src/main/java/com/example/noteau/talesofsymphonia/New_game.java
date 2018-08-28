package com.example.noteau.talesofsymphonia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class New_game extends AppCompatActivity {

    int gold = 100;
    int vie = 10;
    int vie_max = 10;
    int mana = 10;
    int mana_max = 12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_game);

        configureSocialButton();
        configureInventaireButton();
        configureMapButton();
        configureClasseButton();
        configureDesButton();
        configureRepasButton();
        configureBoulotButton();
    }

    private void configureDesButton() {
        Button button1_bt = findViewById(R.id.Button1);
        button1_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Jeu_des();
            }
        });
    }

    private void Jeu_des() {
        TextView textView = (TextView) findViewById(R.id.Description);
        textView.setText("Un nain fais rouler ses dés à la recherche d’un partenaire, en voyant que vous l’observez il vous invite a venir\n Sur sa table vous trouvez, en plus de différents set de dés, une biére à moitié vide, les restes d’un repas froid.\n Cela doit faire plusieurs heures qu’il attend\n Son sourire dévoile quelques dents en or.\n« C’est rare de croiser des elfes prêt à jouer. Tu tente ta chance contre moi ? Mais attention on m’appele Ulric le veinard.Les régles sont simples on pari tout les deux la même somme, on fait rouler les dés, celui qui a fais le plus remporte le tout. En cas d’égalité on reprend nos mises. Les régles te vont ou tu a peur de perdre ?»\n");
        Button button1 = findViewById(R.id.Button1);
        button1.setText("Miser 10 pieces d'or");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mise_10(); 
            }
        });
        Button button2 = findViewById(R.id.Button2);
        button2.setText("Miser 5 piéces d'or");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mise_5();   
            }
        });
        Button button3 = findViewById(R.id.Button3);
        button3.setText("Partir");
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Partir();
            }
        });
    }

    private void Partir() {
        TextView textView = (TextView) findViewById(R.id.Description);
        textView.setText("Vous vous remettez à observer la taverne:\n-le nain est toujours prêt à jouer\n-un repas chaud vous ferez du bien\n-le comptoir vous parait un endroit idéal pour chercher un nouveau boulot\n Qu'allez vous faire ?\n");
        configureDesButton();
        configureBoulotButton();
        configureRepasButton();
        Button button1 = findViewById(R.id.Button1);
        button1.setText("Aller jouer aux dés");
        Button button2 = findViewById(R.id.Button2);
        button2.setText("Prendre un repas");
        Button button3 = findViewById(R.id.Button3);
        button3.setText("Chercher un nouveau petit boulot");
    }

    private void Mise_10() {

        if (this.gold >= 10) {
            TextView textView = (TextView) findViewById(R.id.Description);
            textView.setText("Le nain sourit en voyant vos piéces sur la table et attrape d'un geste vif deux dés.\nIl semble les jauger d'un coup d'oeil puis vous en tend un alors que malgré votre vision développé ils vous paraissent en tout point similaires.\nIl sort de sa poche 10 piéces, elle ne sont pas aussi brillante que les votres mais ce sont bien des vrais\n'Pret à jouer ou bien tu a changé d'avis ?'");
            this.gold = this.gold - 10;
            TextView gold = findViewById(R.id.Gold);
            gold.setText(this.gold + "G");
            Button button1 = findViewById(R.id.Button1);
            button1.setText("Lancer les dés");
            Button button2 = findViewById(R.id.Button2);
            button2.setText("Changer la mise");
            Button button3 = findViewById(R.id.Button3);
            button3.setText("Quitter la table");
        }
        else {
            TextView textView = (TextView) findViewById(R.id.Description);
            textView.setText("'Pas si vite l'ami, il me semble que tu n'a plus rien à miser ? Et pour le respect des clients je t'interdis de miser autre chose que l'argent alors soit tu trouve plus d'argent soit tu dégages compris ?'\nIl pose la main sur le manche d'une hachette, qui est accroché à sa hanche, pour appuyer ses propos.");
            final Button button2 = findViewById(R.id.Button2);
            button2.setVisibility(View.INVISIBLE);
            final Button button3 = findViewById(R.id.Button3);
            button3.setVisibility(View.INVISIBLE);
            Button button1 = findViewById(R.id.Button1);
            button1.setText("Quitter la table");
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    Partir();
                }
            });

        }
    }

    private void Mise_5() {
        if (this.gold >= 5) {
            TextView textView = (TextView) findViewById(R.id.Description);
            textView.setText("Le nain semble un peu décu de voir vos maigres piéces mais ne rajoute rien avant d'attraper les dés\nIl semble les jauger d'un coup d'oeil puis vous en tend un alors que malgré votre vision développé ils vous paraissent en tout point similaires.\nIl jette avec lenteur les 5 pieces requises\n'Pret à jouer ou bien tu a changé d'avis ?'");
            this.gold = this.gold - 5;
            TextView gold = findViewById(R.id.Gold);
            gold.setText(this.gold + "G");
            Button button1 = findViewById(R.id.Button1);
            button1.setText("Lancer les dés");
            Button button2 = findViewById(R.id.Button2);
            button2.setText("Changer la mise");
            Button button3 = findViewById(R.id.Button3);
            button3.setText("Quitter la table");
        }
        else {
            TextView textView = (TextView) findViewById(R.id.Description);
            textView.setText("'Pas si vite l'ami, il me semble que tu n'a plus rien à miser ? Et pour le respect des clients je t'interdis de miser autre chose que l'argent alors soit tu trouve plus d'argent soit tu dégages compris ?'\nIl pose la main sur le manche d'une hachette, qui est accroché à sa hanche, pour appuyer ses propos.");
            final Button button2 = findViewById(R.id.Button2);
            button2.setVisibility(View.INVISIBLE);
            final Button button3 = findViewById(R.id.Button3);
            button3.setVisibility(View.INVISIBLE);
            Button button1 = findViewById(R.id.Button1);
            button1.setText("Quitter la table");
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    Partir();
                }
            });

        }
    }

    private void configureRepasButton() {
        Button button2_bt = findViewById(R.id.Button2);
        button2_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.Description);
                textView.setText("La tavernier s'approche de vous alors qu'il nettoie un verre\n'De la verdure pour l'efe ?'\nVous souriez, il est vrai que vos congénères sont réputés pour leur régime alimentaire. Cependant de nombreuses semaines sur les routes et les temps difficiles qu'un mercenaire peut rencontrer ont eu raison de votre régime\nVous avez appris à cuire et à savourer le gibier qui peuple les forêts\n'Un lapin mon brave.'\nL'homme semble surpris mais encaisse votre commande sans faire plus de remarques.\nAprès quelques minutes un rongeur délicatement cuit accompagné de pomme de terre atterit sur votre table.\nVous le savourez en silence, confortablement installé sur votre chaise.\nVous profitez du calme du repas pour détailler la population de la taverne :\n-Un nain cherche toujours un compagnon de jeu\n-Vous remarquez une jeune femme que les gens semblent éviter, sa tenue vous informe qu'elle doit pratiquer l'art de la divination\n-Un homme, plutot grand est au comptoir et semble enchainer les verres d'alcool en marmonant à voix basse. Le tavernier lui jette des regards inquiets de temps en temps\nLes autres personnes semblent vaquer à leurs affaires ou ne s'attardant pas vraiment dans la taverne.");
                Button button1 = findViewById(R.id.Button1);
                button1.setText("Jouer au dés");
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Jeu_des();
                    }
                });
                Button button2 = findViewById(R.id.Button2);
                button2.setText("Allez voir la devin");
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Devin();
                    }
                });
                Button button3 = findViewById(R.id.Button3);
                button3.setText("S'approcher de l'homme");
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Boulot();
                    }
                });
            }
        });
    }

    private void Boulot() {
    }

    private void Devin() {
    }

    private void configureBoulotButton() {
        Button button3_bt = findViewById(R.id.Button3);
        button3_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.Description);
                textView.setText("Vous approchez du comptoir et notamment d'un homme qui semble avoir un sérieux probleme de boisson, ou qui tente d'oublier quelque chose. Vous ne comprenez pas ce qu'il marmonne mais à sa tenue il est clair qu'il fait parti de la garde de la ville.\n Vous détaillez un peu plus sa tenue\nAu bout de quelque instants vous comprenez ce qui vous perturbez en le regardant :\nil doit être le chef de la garde de Symphonia. Vous vous asseyez sur le siége le plus proche de cet homme et il semble enfin remarquer votre présence\n-Vous ne sauriez pas ce qu'un mercenaire pourrait faire en ville ?\nIl éclate de rire, un rire effrayant et dément\n Certaines personnes quittent précitemment le bar.\n-Les pretres et les loups blancs cherchent des gens pour leur expédition mais à votre place je n'y irais pas. Tous les hommes que j'ai envoyé y sont mort.Seul la mort nous attend la-bas\nGuere impressionné vous quittez l'auberge bien déterminé à éclaircir ce mystére.\n");
                Button button1 = findViewById(R.id.Button1);
                button1.setText("Allez voir un marchand");
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Marchand();
                    }
                });
                Button button2 = findViewById(R.id.Button2);
                button2.setText("Allez directement à la rencontre des pretres et des loups blancs");
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Mission();
                    }
                });
                Button button3 = findViewById(R.id.Button3);
                button3.setText("Donner une piece à un mendiant");
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Mendiant();
                    }
                });
            }
        });
    }

    private void Mendiant() {
    }

    private void Marchand() {

    }
    private void Mission() {
    }

    private void configureClasseButton() {
        Button Classe_bt = findViewById(R.id.selec_classe);
        Classe_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(New_game.this, Classe_selection.class));
            }
        });
    }

    private void configureMapButton() {
        ImageButton Map_bt = findViewById(R.id.Map);
        Map_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(New_game.this, Map.class));
            }
        });
    }

    private void configureInventaireButton() {
        ImageButton Inventaire_bt = findViewById(R.id.Inventaire);
        Inventaire_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(New_game.this, Inventaire.class));
            }
        });
    }

    private void configureSocialButton() {
        ImageButton Social_bt =  findViewById(R.id.Social);
        Social_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(New_game.this, Social.class));
            }
        });
    }
}
