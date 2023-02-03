var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":84,"id":84691,"methods":[{"el":29,"sc":3,"sl":26},{"el":34,"sc":3,"sl":31},{"el":39,"sc":1,"sl":37},{"el":44,"sc":1,"sl":42},{"el":49,"sc":1,"sl":47},{"el":55,"sc":1,"sl":52},{"el":61,"sc":1,"sl":58},{"el":67,"sc":1,"sl":64}],"name":"PeepholeFoldWithTypesTest","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2307":{"methods":[{"sl":26},{"sl":52}],"name":"testFoldTypeofNumber1290","pass":true,"statements":[{"sl":28},{"sl":53},{"sl":54}]},"test_243":{"methods":[{"sl":26},{"sl":58}],"name":"testFoldTypeofBoolean1953","pass":true,"statements":[{"sl":28},{"sl":59},{"sl":60}]},"test_56":{"methods":[{"sl":26},{"sl":64}],"name":"testFoldTypeofString2461","pass":true,"statements":[{"sl":28},{"sl":65},{"sl":66}]},"test_753":{"methods":[{"sl":26},{"sl":47}],"name":"testDontFoldTypeofSideEffects882","pass":true,"statements":[{"sl":28},{"sl":48}]},"test_909":{"methods":[{"sl":26},{"sl":37}],"name":"testFoldTypeofUndefined570","pass":true,"statements":[{"sl":28},{"sl":38}]},"test_990":{"methods":[{"sl":26},{"sl":42}],"name":"testDontFoldTypeofUnionTypes865","pass":true,"statements":[{"sl":28},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [753, 909, 2307, 243, 990, 56], [], [753, 909, 2307, 243, 990, 56], [], [], [], [], [], [], [], [], [909], [909], [], [], [], [990], [990], [], [], [], [753], [753], [], [], [], [2307], [2307], [2307], [], [], [], [243], [243], [243], [], [], [], [56], [56], [56], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
