package org.nd4j.linalg.api.ops.impl.controlflow;

import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ops.DynamicCustomOp;
import org.nd4j.linalg.api.ops.Op;

/**
 * From the onnx docs:
 *   Given DATA tensor of rank r >= 1, and INDICES tensor of rank q, gather
 entries of the outer-most dimension of DATA indexed by INDICES, and concatenate
 them in an output tensor of rank q + (r - 1).

 Example:
 DATA  = [
 [1.0, 1.2],
 [2.3, 3.4],
 [4.5, 5.7],
 ]
 INDICES = [
 [0, 1],
 [1, 2],
 ]
 OUTPUT = [
 [
 [1.0, 1.2],
 [2.3, 3.4],
 ],
 [
 [2.3, 3.4],
 [4.5, 5.7],
 ],
 ]



 */
public class Exit extends DynamicCustomOp {
    @Override
    public String opName() {
        return "exit";
    }

    @Override
    public String onnxName() {
        throw new NoOpNameFoundException("No op name found for " + opName());
    }

    @Override
    public String tensorflowName() {
       return "Exit";
    }

    @Override
    public Op.Type opType() {
        return Op.Type.LOOP;
    }


}
