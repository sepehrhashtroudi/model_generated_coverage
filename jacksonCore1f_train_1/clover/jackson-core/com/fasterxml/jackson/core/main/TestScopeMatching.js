var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":92,"id":15661,"methods":[{"el":27,"sc":1,"sl":15},{"el":45,"sc":1,"sl":30},{"el":61,"sc":1,"sl":48},{"el":77,"sc":1,"sl":64}],"name":"TestScopeMatching","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_15":{"methods":[{"sl":30}],"name":"testMismatchArrayToObject17","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":41},{"sl":43}]},"test_16":{"methods":[{"sl":48}],"name":"testWeirdToken56","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":57},{"sl":59}]},"test_43":{"methods":[{"sl":15}],"name":"testUnclosedArray16","pass":true,"statements":[{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":25}]},"test_72":{"methods":[{"sl":64}],"name":"testEOFInName63","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":73},{"sl":75}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [43], [43], [], [43], [43], [43], [43], [43], [], [], [43], [], [], [], [], [15], [15], [15], [15], [15], [15], [15], [15], [15], [], [], [15], [], [15], [], [], [], [], [16], [16], [16], [16], [16], [16], [16], [], [], [16], [], [16], [], [], [], [], [72], [72], [72], [72], [72], [72], [72], [], [], [72], [], [72], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
