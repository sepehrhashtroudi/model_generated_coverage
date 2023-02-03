var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":105,"id":71720,"methods":[{"el":30,"sc":3,"sl":26},{"el":36,"sc":1,"sl":33},{"el":44,"sc":1,"sl":39},{"el":49,"sc":1,"sl":47},{"el":55,"sc":1,"sl":52},{"el":60,"sc":1,"sl":58},{"el":104,"sc":3,"sl":102}],"name":"CheckUnreachableCodeTest","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1806":{"methods":[{"sl":26},{"sl":39}],"name":"testCorrectIfReturns472","pass":true,"statements":[{"sl":28},{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_1869":{"methods":[{"sl":26},{"sl":52},{"sl":102}],"name":"testInfiniteLoop1654","pass":true,"statements":[{"sl":28},{"sl":53},{"sl":54},{"sl":103}]},"test_2190":{"methods":[{"sl":26},{"sl":47},{"sl":102}],"name":"testInCorrectIfReturns846","pass":true,"statements":[{"sl":28},{"sl":48},{"sl":103}]},"test_406":{"methods":[{"sl":26},{"sl":33},{"sl":102}],"name":"testVarDeclaration52","pass":true,"statements":[{"sl":28},{"sl":34},{"sl":35},{"sl":103}]},"test_675":{"methods":[{"sl":26},{"sl":58},{"sl":102}],"name":"testUnreachableLoop1903","pass":true,"statements":[{"sl":28},{"sl":59},{"sl":103}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [406, 1806, 1869, 675, 2190], [], [406, 1806, 1869, 675, 2190], [], [], [], [], [406], [406], [406], [], [], [], [1806], [1806], [1806], [1806], [1806], [], [], [], [2190], [2190], [], [], [], [1869], [1869], [1869], [], [], [], [675], [675], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [406, 1869, 675, 2190], [406, 1869, 675, 2190], [], []]
