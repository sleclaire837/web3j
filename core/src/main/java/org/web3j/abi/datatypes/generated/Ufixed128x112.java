package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Ufixed;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Ufixed128x112 extends Ufixed {
    public static final Ufixed128x112 DEFAULT = new Ufixed128x112(BigInteger.ZERO);

    public Ufixed128x112(BigInteger value) {
        super(128, 112, value);
    }

    public Ufixed128x112(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(128, 112, m, n);
    }
}
