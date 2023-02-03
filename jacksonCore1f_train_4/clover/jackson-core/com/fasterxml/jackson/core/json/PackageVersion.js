var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":12992,"methods":[{"el":19,"sc":5,"sl":16}],"name":"PackageVersion","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_109":{"methods":[{"sl":16}],"name":"testCoreVersions9","pass":true,"statements":[{"sl":18}]},"test_73":{"methods":[{"sl":16}],"name":"testPackageVersionMatches46","pass":true,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [73, 109], [], [73, 109], [], []]
