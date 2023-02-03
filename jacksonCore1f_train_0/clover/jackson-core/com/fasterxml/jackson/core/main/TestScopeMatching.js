var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":110,"id":15179,"methods":[{"el":30,"sc":1,"sl":15},{"el":46,"sc":1,"sl":33},{"el":63,"sc":1,"sl":49},{"el":79,"sc":1,"sl":66},{"el":95,"sc":1,"sl":82}],"name":"TestScopeMatching","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_108":{"methods":[{"sl":15}],"name":"testMismatchArrayToObject15","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":26},{"sl":28}]},"test_18":{"methods":[{"sl":66}],"name":"testWeirdToken54","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":75},{"sl":77}]},"test_28":{"methods":[{"sl":33}],"name":"testMismatchObjectToArray50","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":42},{"sl":44}]},"test_42":{"methods":[{"sl":82}],"name":"testEOFInName59","pass":true,"statements":[{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":91},{"sl":93}]},"test_91":{"methods":[{"sl":49}],"name":"testMisssingColon51","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":59},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [108], [108], [108], [108], [108], [108], [108], [108], [108], [], [], [108], [], [108], [], [], [], [], [28], [28], [28], [28], [28], [28], [28], [], [], [28], [], [28], [], [], [], [], [91], [91], [91], [91], [91], [91], [91], [], [], [], [91], [], [91], [], [], [], [], [18], [18], [18], [18], [18], [18], [18], [], [], [18], [], [18], [], [], [], [], [42], [42], [42], [42], [42], [42], [42], [], [], [42], [], [42], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
