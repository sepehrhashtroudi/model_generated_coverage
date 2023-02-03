var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":11043,"methods":[{"el":19,"sc":5,"sl":16}],"name":"PackageVersion","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_128":{"methods":[{"sl":16}],"name":"testCoreVersions9","pass":true,"statements":[{"sl":18}]},"test_9":{"methods":[{"sl":16}],"name":"testPackageVersionMatches44","pass":true,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [9, 128], [], [9, 128], [], []]
