var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":37074,"methods":[{"el":36,"sc":3,"sl":30},{"el":41,"sc":3,"sl":38}],"name":"StrictWarningsGuard","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_36":{"methods":[{"sl":30},{"sl":38}],"name":"testStrictWarningsGuardEmergencyMode210","pass":true,"statements":[{"sl":32},{"sl":35},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [36], [], [36], [], [], [36], [], [], [36], [], [36], [], []]
