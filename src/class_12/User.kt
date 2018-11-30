package class_12

data class User(var id: Int,
                var name: String,
                var playerType: PlayerViewType = PlayerViewType.BLUE)