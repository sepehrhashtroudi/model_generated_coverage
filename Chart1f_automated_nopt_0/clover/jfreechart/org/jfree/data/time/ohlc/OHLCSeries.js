var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":123,"id":8274,"methods":[{"el":66,"sc":5,"sl":64},{"el":78,"sc":5,"sl":75},{"el":89,"sc":5,"sl":87},{"el":110,"sc":5,"sl":100},{"el":121,"sc":5,"sl":119}],"name":"OHLCSeries","sl":55}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1013":{"methods":[{"sl":64}],"name":"testRemoveSeries874","pass":true,"statements":[{"sl":65}]},"test_1092":{"methods":[{"sl":64}],"name":"testRemoveAllSeries876","pass":false,"statements":[{"sl":65}]},"test_222":{"methods":[{"sl":64}],"name":"testRemoveAllSeries876","pass":false,"statements":[{"sl":65}]},"test_37":{"methods":[{"sl":64}],"name":"testRemoveAllSeries875","pass":false,"statements":[{"sl":65}]},"test_434":{"methods":[{"sl":64}],"name":"testRemoveSeries874","pass":true,"statements":[{"sl":65}]},"test_992":{"methods":[{"sl":64}],"name":"testRemoveAllSeries875","pass":false,"statements":[{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1092, 222, 1013, 434, 992, 37], [1092, 222, 1013, 434, 992, 37], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
