public class Tree {
    double heightFit;
    double trunkDiameterInches;
    TreeType treetype;

    void grow() {
        this.heightFit = this.heightFit + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;

    }
}
