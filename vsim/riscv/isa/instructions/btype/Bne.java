package vsim.riscv.isa.instructions.btype;


public final class Bne extends BType {

    @Override
    protected boolean comparison(int rs1, int rs2) {
        return rs1 != rs2;
    }

}