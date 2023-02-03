var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":97,"id":35192,"methods":[{"el":72,"sc":1,"sl":66},{"el":87,"sc":1,"sl":75}],"name":"TestInjectables","sl":7},{"el":25,"id":35192,"methods":[{"el":24,"sc":9,"sl":21}],"name":"TestInjectables.InjectedBean","sl":9},{"el":30,"id":35194,"methods":[],"name":"TestInjectables.BadBean1","sl":27},{"el":35,"id":35194,"methods":[],"name":"TestInjectables.BadBean2","sl":32},{"el":46,"id":35194,"methods":[{"el":45,"sc":9,"sl":41}],"name":"TestInjectables.CtorBean","sl":37},{"el":57,"id":35197,"methods":[{"el":56,"sc":9,"sl":52}],"name":"TestInjectables.CtorBean2","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_272":{"methods":[{"sl":52},{"sl":66}],"name":"testTwoInjectablesViaCreator7","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_408":{"methods":[{"sl":75}],"name":"testInvalidDup431","pass":true,"statements":[{"sl":76},{"sl":77},{"sl":78},{"sl":80},{"sl":82},{"sl":83},{"sl":85}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [272], [], [272], [272], [], [], [], [], [], [], [], [], [], [], [272], [272], [272], [272], [272], [272], [], [], [], [408], [408], [408], [408], [], [408], [], [408], [408], [], [408], [], [], [], [], [], [], [], [], [], [], [], []]
