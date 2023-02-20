var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":1990,"methods":[{"el":49,"sc":3,"sl":45}],"name":"LowerCaseNamingPolicy","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_114":{"methods":[{"sl":45}],"name":"testAllLowerCase184","pass":true,"statements":[{"sl":48}]},"test_145":{"methods":[{"sl":45}],"name":"testUsingDashesInstead1","pass":true,"statements":[{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [114, 145], [], [], [114, 145], [], []]
