public class Adapter extends AncienneImpl implements Standard{

    @Override
    public void operation(int nb1, int nb2) {
        double res = super.calcul((double) nb1,nb2);
        super.print(res);
    }
}
