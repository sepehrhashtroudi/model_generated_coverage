var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":94,"id":33521,"methods":[{"el":60,"sc":1,"sl":56},{"el":74,"sc":1,"sl":63}],"name":"TestGenerics","sl":7},{"el":13,"id":33521,"methods":[],"name":"TestGenerics.BaseNumberBean","sl":10},{"el":25,"id":33521,"methods":[{"el":24,"sc":9,"sl":20}],"name":"TestGenerics.NumberBean","sl":15},{"el":33,"id":33523,"methods":[],"name":"TestGenerics.SimpleBean","sl":30},{"el":47,"id":33523,"methods":[{"el":39,"sc":9,"sl":39},{"el":41,"sc":9,"sl":41},{"el":46,"sc":9,"sl":43}],"name":"TestGenerics.Wrapper","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_493":{"methods":[{"sl":39},{"sl":41},{"sl":43},{"sl":63}],"name":"testMultipleWrappers255","pass":true,"statements":[{"sl":41},{"sl":45},{"sl":64},{"sl":65},{"sl":67},{"sl":68},{"sl":70},{"sl":71},{"sl":73}]},"test_573":{"methods":[{"sl":20},{"sl":56}],"name":"testSimpleNumberBean169","pass":true,"statements":[{"sl":23},{"sl":57},{"sl":58},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [573], [], [], [573], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [493], [], [493], [], [493], [], [493], [], [], [], [], [], [], [], [], [], [], [573], [573], [573], [573], [], [], [], [493], [493], [493], [], [493], [493], [], [493], [493], [], [493], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
