var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":105,"id":35190,"methods":[],"name":"TestViewSerialization","sl":14},{"el":24,"id":35190,"methods":[],"name":"TestViewSerialization.ViewA","sl":24},{"el":25,"id":35190,"methods":[],"name":"TestViewSerialization.ViewAA","sl":25},{"el":26,"id":35190,"methods":[],"name":"TestViewSerialization.ViewB","sl":26},{"el":27,"id":35190,"methods":[],"name":"TestViewSerialization.ViewBB","sl":27},{"el":39,"id":35190,"methods":[{"el":38,"sc":9,"sl":37}],"name":"TestViewSerialization.Bean","sl":29},{"el":52,"id":35192,"methods":[{"el":51,"sc":9,"sl":51}],"name":"TestViewSerialization.MixedBean","sl":46},{"el":62,"id":35194,"methods":[],"name":"TestViewSerialization.ImplicitBean","sl":59},{"el":69,"id":35194,"methods":[],"name":"TestViewSerialization.VisibilityBean","sl":64},{"el":72,"id":35194,"methods":[],"name":"TestViewSerialization.WebView","sl":72},{"el":73,"id":35194,"methods":[],"name":"TestViewSerialization.OtherView","sl":73},{"el":77,"id":35194,"methods":[{"el":76,"sc":9,"sl":75}],"name":"TestViewSerialization.Foo","sl":74}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
