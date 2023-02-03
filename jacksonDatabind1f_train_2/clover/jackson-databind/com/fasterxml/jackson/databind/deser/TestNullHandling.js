var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":38253,"methods":[{"el":49,"sc":1,"sl":37}],"name":"TestNullHandling","sl":10},{"el":27,"id":38253,"methods":[{"el":23,"sc":9,"sl":20},{"el":26,"sc":9,"sl":25}],"name":"TestNullHandling.FunnyNullDeserializer","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_85":{"methods":[{"sl":25},{"sl":37}],"name":"testCustomRootNulls442","pass":true,"statements":[{"sl":26},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [85], [85], [], [], [], [], [], [], [], [], [], [], [85], [85], [85], [85], [85], [85], [85], [85], [85], [85], [85], [85], [], [], [], []]
