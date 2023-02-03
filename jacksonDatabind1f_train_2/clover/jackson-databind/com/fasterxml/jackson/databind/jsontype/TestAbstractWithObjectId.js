var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":34545,"methods":[{"el":56,"sc":1,"sl":40}],"name":"TestAbstractWithObjectId","sl":10},{"el":12,"id":34545,"methods":[],"name":"TestAbstractWithObjectId.BaseInterface","sl":12},{"el":23,"id":34545,"methods":[{"el":22,"sc":9,"sl":20}],"name":"TestAbstractWithObjectId.BaseInterfaceImpl","sl":15},{"el":37,"id":34547,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34}],"name":"TestAbstractWithObjectId.ListWrapper","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_247":{"methods":[{"sl":20},{"sl":30},{"sl":34},{"sl":40}],"name":"testIssue877297","pass":true,"statements":[{"sl":21},{"sl":31},{"sl":35},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":54},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [247], [247], [], [], [], [], [], [], [], [], [247], [247], [], [], [247], [247], [], [], [], [], [247], [247], [247], [247], [247], [247], [247], [247], [247], [247], [247], [247], [247], [], [247], [247], [], [], [], []]
