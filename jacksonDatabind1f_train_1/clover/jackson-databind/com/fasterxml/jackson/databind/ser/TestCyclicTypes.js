var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":38025,"methods":[{"el":57,"sc":1,"sl":46}],"name":"TestCyclicTypes","sl":14},{"el":37,"id":38025,"methods":[{"el":31,"sc":9,"sl":28},{"el":33,"sc":9,"sl":33},{"el":34,"sc":9,"sl":34},{"el":36,"sc":9,"sl":36}],"name":"TestCyclicTypes.Bean","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_66":{"methods":[{"sl":28},{"sl":33},{"sl":34},{"sl":36},{"sl":46}],"name":"testSelfReference426","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":33},{"sl":34},{"sl":36},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [66], [66], [66], [], [], [66], [66], [], [66], [], [], [], [], [], [], [], [], [], [66], [66], [66], [66], [66], [66], [66], [66], [], [66], [], [], [], [], [], [], [], [], [], []]
