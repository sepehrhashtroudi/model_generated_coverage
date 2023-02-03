var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":34276,"methods":[{"el":74,"sc":1,"sl":66},{"el":89,"sc":1,"sl":77}],"name":"TestInjectables","sl":7},{"el":25,"id":34276,"methods":[{"el":24,"sc":9,"sl":21}],"name":"TestInjectables.InjectedBean","sl":9},{"el":30,"id":34278,"methods":[],"name":"TestInjectables.BadBean1","sl":27},{"el":35,"id":34278,"methods":[],"name":"TestInjectables.BadBean2","sl":32},{"el":46,"id":34278,"methods":[{"el":45,"sc":9,"sl":41}],"name":"TestInjectables.CtorBean","sl":37},{"el":57,"id":34281,"methods":[{"el":56,"sc":9,"sl":52}],"name":"TestInjectables.CtorBean2","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_106":{"methods":[{"sl":21},{"sl":66}],"name":"testSimple9","pass":true,"statements":[{"sl":23},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73}]},"test_171":{"methods":[{"sl":77}],"name":"testInvalidDup441","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":84},{"sl":85},{"sl":87}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [106], [], [106], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [106], [106], [106], [106], [106], [106], [106], [106], [], [], [], [171], [171], [171], [171], [], [171], [], [171], [171], [], [171], [], [], [], [], [], [], [], [], [], [], [], []]
